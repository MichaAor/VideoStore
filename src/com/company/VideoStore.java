package com.company;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VideoStore {
    private List<Cliente> clientes;
    private List<Film> catalogo;
    private List<Alquiler> alquileres;

    public static Scanner sc = new Scanner(System.in);

    public BoletaPrest alquiler() {
        System.out.println("Ingrese nombre de pelicula");
        String titulo = sc.nextLine();
        BoletaPrest boli = new BoletaPrest();
        Film peli = this.revisarCatalogo(titulo);


        if (peli != null) {
            Cliente c1 = new Cliente();
            System.out.println("Por favor,ingrese sus datos en el siguiente orden: NOMBRE // TELEFONO // DIRECCION");
            c1.setNombre(sc.nextLine());
            c1.setTelefono(sc.nextInt());
            c1.setDireccion(sc.nextLine());
            if (this.controlarCliente(c1)) {
                Alquiler ahora = new Alquiler(peli, c1);
                this.upi(peli);
                this.alquileres.add(ahora);
                boli = ahora.getBoleta();
            }
        }
        return boli;
    }

    public void upi(Film film) {
        int seg = 0;
        for (Film actual : this.catalogo) {
            if (actual.equals(film)) {
                actual.setDuracion(actual.getDuracion() + 1);
            } else {
                seg++;
            }
        }
    }

    public void mostrarAlquileres() {
        for (Alquiler actual : this.alquileres) {
            System.out.println(actual.toString());
        }
    }

    public void mostrarAlquileresHOY(LocalDate hoy) {
        for (Alquiler actual : this.alquileres) {
            if (actual.getBoleta().getfDevolucion().equals(hoy)) {
                System.out.println(actual.toString());
            }
        }
    }

    public void mostrarUlt10Clnt(Cliente cliente) {
        int cant = 0;
        for (Alquiler actual : this.alquileres) {
            if (actual.getCliente().equals(cliente) && cant > 10) {
                System.out.println(actual.toString());
                cant++;
            }
        }
    }


    public Film revisarCatalogo(String titulo) {
        Film encontrado = new Film();
        char resp = 's';
        while (resp == 's') {
            for (Film peli : this.catalogo) {
                if (peli.getTitulo() == titulo) {
                    if (peli.getStock() > 0) {
                        System.out.println("La pelicula existe y posee stock");
                        encontrado = peli;
                    } else {
                        System.out.println("La pelicula existe pero no hay stock");
                    }
                } else {
                    System.out.println("La pelicula no existe");
                }
            }
            resp = this.cuestion();
        }
        return encontrado;
    }

    public char cuestion() {
        System.out.println("Desea volver a intentarlo? s/n ");
        return sc.nextLine().charAt(0);
    }

    public boolean controlarCliente(Cliente cliente) {
        boolean rt = false;
        for (Cliente c1 : this.clientes) {
            if (c1.equals(cliente)) {
                rt = true;
                System.out.println("El cliente existe,prosiga");
            } else {
                System.out.println("El cliente no existe,por favor,registrese");
            }
        }
        return rt;
    }

}

        /*public void mostrarMasAlquilados(List<Film> catalogo){
            List<Film> mVal = new ArrayList<Film>();
            for(Film peli : catalogo){
                Film aux = new Film();
                aux = peli;
                if(!aux.equals(peli)){
                    if(aux.getCantVecesAlq() >= peli.getCantVecesAlq()){
                        mVal.add(aux);
                    }
                }
                this.mostrarAlquileresHOY(catalogo.);
            }
        }*/





}

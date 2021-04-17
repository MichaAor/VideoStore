package com.company;

import java.util.List;
import java.util.Scanner;

public class VideoStore {
    private List<Cliente> clientes;
    private List<Film> catalogo;
    private List<Alquiler> alquileres;

    public static Scanner sc = new Scanner(System.in);

    public BoletaPrest alquiler(){
            System.out.println("Ingrese nombre de pelicula");
            String titulo = sc.nextLine();
            BoletaPrest boli = new BoletaPrest();
            Film peli = this.revisarCatalogo(titulo);


            if(peli != null){
                Cliente c1 = new Cliente();
                System.out.println("Por favor,ingrese sus datos en el siguiente orden: NOMBRE // TELEFONO // DIRECCION");
                c1.setNombre(sc.nextLine());c1.setTelefono(sc.nextInt());c1.setDireccion(sc.nextLine());
                if(this.controlarCliente(c1)){
                    Alquiler ahora = new Alquiler(peli,c1);
                    this.upi(peli);
                    boli = ahora.getBoleta();
                    this.alquileres.add(ahora);
                }
            }
    return boli;
        }

        public Film revisarCatalogo(String titulo){
            Film encontrado = new Film();
            char resp = 's';
            while(resp == 's') {
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

        public boolean controlarCliente(Cliente cliente){
            boolean rt = false;
            for(Cliente c1 : this.clientes){
                if(c1.equals(cliente)){
                    rt = true;
                    System.out.println("El cliente existe,prosiga");
                }else {
                    System.out.println("El cliente no existe,por favor,registrese");
                }
            }
            return rt;
        }

        public char cuestion(){
        System.out.println("Desea volver a intentarlo? s/n ");
        return sc.nextLine().charAt(0);
    }

        public BoletaPrest generarFactura (){
            BoletaPrest factura = new BoletaPrest();
            return factura;
        }

        public void upi(Film film){
        int seg=0;
            for(Film aux : this.catalogo){
                if(aux.equals(film)){
                    this.catalogo.set(seg,aux).fuiAlquilado();
                }else{
                    seg++;
                }
            }
        }

}

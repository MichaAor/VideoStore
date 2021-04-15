package com.company;

import java.util.Scanner;

public class VideoStore {
        public void alquiler(Film[] catalogo){
            Scanner sc = new Scanner(System.in);
            boolean rt;
            System.out.println("Ingrese nombre de pelicula");
            String aux = sc.nextLine();
            for(Film peli : catalogo){
                if(peli.getTitulo() == aux){
                    if(peli.getStock() > 0){
                        System.out.println("La pelicula existe y posee stock");
                        rt = true;
                    }else {
                        System.out.println("La pelicula existe pero no hay stock");
                        rt=false;
                    }
                }else{
                    System.out.println("La pelicula no existe");
                    rt=false;
                }
            }

            if(rt = true){
                Cliente auxC = new Cliente();
                System.out.println("Por favor,ingrese sus datos en el siguiente orden: NOMBRE // TELEFONO // DIRECCION");
                auxC.setNombre(sc.nextLine());auxC.setTelefono(sc.nextInt());auxC.setDireccion(sc.nextLine());
            }

        }
}

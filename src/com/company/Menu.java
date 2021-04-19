package com.company;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.LocalDate;
import java.util.Scanner;

public class Menu {

    public void sistema(VideoStore mI){

    Scanner sc = new Scanner(System.in);
    char rt = 'n';
    int opt = 0;
        while(rt =='n')

    {
        System.out.println("Bienvenido al sistema VideoStore Revan 1.0 \n Por favor,ingrese que desea ver");
        mostrarOpciones();
        opt = sc.nextInt();
        switch (opt) {
            case 1:
                mI.mostrarAlquileres();
            case 2:
                mI.mostrarAlquileresHOY(LocalDate.now());
            case 3:
                System.out.println("Ingrese por favor sus datos: Nombre,telefono,direccion en orden correspondiente");
                Cliente cAux = new Cliente(sc.nextLine(),sc.nextInt(),sc.nextLine());
                mI.mostrarUlt10Clnt(cAux);
            case 4:
                //titulos mas alquilados
            case 5:
                ///También quiere poder buscar títulos por género y ordenarlos según popularidad.
            case 6:
                System.out.println("Ingrese titulo de su pelicula");
                Film fAux = mI.revisarCatalogo(sc.nextLine());
                System.out.println(fAux.toString());

        }
    }

}
    public static void mostrarOpciones (){
        System.out.println("OPCION 1: Consultar alquileres vigentes" +
                        "\n OPCION 2: Consultar devoluciones que deberían hacerse en el dia de la fecha." +
                        "\n OPCION 3: Consultar últimos 10 alquileres de cada cliente." +
                        "\n OPCION 4: Consultar títulos que fueron más alquilados" +
                        "\n OPCION 5: Buscar títulos por género y ordenarlos según popularidad" +
                        "\n OPCION 6: Ver información detallada de un determinado título");
    }

}
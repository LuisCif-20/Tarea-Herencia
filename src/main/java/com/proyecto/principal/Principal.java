package com.proyecto.principal;

import java.util.Scanner;


public class Principal {

    public static void main(String[] args) {
        Principal principal = new Principal();
    }

    private Scanner scan = new Scanner(System.in);
    private Vector vector = new Vector();

    public Principal(){
        int eleccion;
        do {
            System.out.println("¿Que deseas Hacer");
            System.out.println("1) Ver los vehiculos");
            System.out.println("2) Ver que tipo de vehiculo es uno en particular");
            System.out.println("3) Ver funciones del vehiculo");
            System.out.println("4) Salir");
            eleccion = Integer.parseInt(scan.nextLine());
            if (eleccion == 1) {
                vector.mostrarVehiculos();
            } else if ( eleccion == 2)  {
                vector.verOrigen(vector.ingresarVehiculo());
            } else if ( eleccion == 3) {
                vector.verVehiculo();
            } else {
                System.out.println("Hasta Pronto");
            }
            
        } while (eleccion < 4 & eleccion > 0);
        
    }

}

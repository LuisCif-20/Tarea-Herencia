package com.proyecto.carros;

import com.proyecto.interfaces.Camionetas;
import com.proyecto.interfaces.Giro;

public class Bus extends Carro implements Camionetas, Giro{




    public Bus(){
        super();
        super.combustible = "Diesel";
        super.cantidadGalones = 200;
        super.cantidadPasajeros = 28;
        super.velocidadMaxima = 60;
        super.aceleracionBase = 4.2;
    }

    @Override
    public void ingresarPersonas() {
        System.out.println("Frenando en la parada de Bus...");
        System.out.println("Esperando a que ingresen las personas...");
        System.out.println("Recorrer la ruta...");
        System.out.println("Parando que bajen las personas en su destino...");
        System.out.println("¡Listo!");
        System.out.print(" (Se vuelve a repetir)");
    }

    @Override
    public void decidirArccion() {
        System.out.println("Parar en la estaciones donde haya personas con destinos cercanos o en mi ruta");
    }

    @Override
    public void girarIzquierda() {
        System.out.println("Ir lento...");
        System.out.println("Abrirme un poco hacia la derecha...");
        System.out.println("Girar a la izquierda con cuidado...");
        System.out.println("¡Listo!");
        
    }

    @Override
    public void girarDerecha() { 
        System.out.println("Ir lento...");
        System.out.println("Abrirme un poco hacia la izquierda...");
        System.out.println("Girar a la derecha con cuidado...");
        System.out.println("¡Listo!");
    }
    
}

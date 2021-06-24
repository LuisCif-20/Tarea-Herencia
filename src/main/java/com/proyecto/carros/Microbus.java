package com.proyecto.carros;

import com.proyecto.interfaces.Camionetas;
import com.proyecto.interfaces.Giro;

public class Microbus extends Carro implements Camionetas, Giro {


    public Microbus(){
        super();
        super.combustible = "Gasolina";
        super.cantidadGalones = 100;
        super.cantidadPasajeros = 16;
        super.velocidadMaxima = 80;
        super.aceleracionBase = 10.9;
    }

    @Override
    public void girarIzquierda() {
        System.out.println("Abriendose un poquito al lado contrario...");
        System.out.println("Dar el giro hacia la izquierda...");
        System.out.println("¡Listo!");
        
    }

    @Override
    public void girarDerecha() {
        System.out.println("Abriendose un poquito al lado contrario...");
        System.out.println("Dar el giro hacia la derecha...");
        System.out.println("¡Listo!");
        
    }

    @Override
    public void ingresarPersonas() {
        System.out.println("Para en las estaciones de bus e ingresar las personas");
        
    }

    @Override
    public void decidirArccion() {
        System.out.println("Transportar menos cantidad de personas");
        
    }
    
}

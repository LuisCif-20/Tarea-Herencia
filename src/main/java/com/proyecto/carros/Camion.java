package com.proyecto.carros;

import com.proyecto.interfaces.CarroCarga;
import com.proyecto.interfaces.Giro;

public class Camion extends Carro implements CarroCarga, Giro{


    public Camion(){
        super();
        super.combustible = "Diesel";
        super.cantidadGalones = 100;
        super.cantidadPasajeros = 2;
        super.velocidadMaxima = 80;
        super.aceleracionBase = 20.5;
    }

    @Override
    public void transportarMaterial() {
        System.out.println("Subiendo Arena y Hierro...");
        System.out.println("Empezando transcurso para llegar al destino...");
        System.out.println("Lllegando al lugar de Destino...");
        System.out.println("Descargando...");
        System.out.println("¡Listo!");
        
    }

    @Override
    public void decidirArccion() {
        System.out.println("Transportar Arena y Hierro");       
    }

    @Override
    public void girarIzquierda() {
        System.out.println("Iendo despacio...");
        System.out.println("Abrirse un poco a la derecha...");
        System.out.println("Girando hacia la izquierda...");
        System.out.println("¡Listo!");
        
    }

    @Override
    public void girarDerecha() {
        System.out.println("Iendo despacio...");
        System.out.println("Abrise un poco a la izquierda...");
        System.out.println("Girando hacia la derecha...");
        System.out.println("¡Listo!");
        
    }


    
}

package com.proyecto.carros;

import com.proyecto.interfaces.CarroCarrera;
import com.proyecto.interfaces.Giro;

public class Deportivo extends Carro implements CarroCarrera, Giro {


    public Deportivo(){
        super();
        super.combustible = "Gasolina";
        super.cantidadGalones = 150;
        super.cantidadPasajeros = 4;
        super.velocidadMaxima = 200;
        super.aceleracionBase = 130.5;
    }

    @Override
    public double acelerarCarro() {
        this.setAceleracionBase(this.getAceleracionBase()*3);
        return this.aceleracionBase;
    }

    @Override
    public void decidirArccion() {
        System.out.println("Pasear por la ciudad");
        
    }

    @Override
    public void girarIzquierda() {
        System.out.println("Bajando Velocidad...");
        System.out.println("Frenando levemente...");
        System.out.println("Girando hacia la izquierda...");
        System.out.println("Acelerar...");
        System.out.println("¡Listo!");
        
    }

    @Override
    public void girarDerecha() {
        System.out.println("Bajando Velocidad...");
        System.out.println("Frenando levemente...");
        System.out.println("Girando hacia la derecha...");
        System.out.println("Acelerar...");
        System.out.println("¡Listo!");
        
    }
    
}

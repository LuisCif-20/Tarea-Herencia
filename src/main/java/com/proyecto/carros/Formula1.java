package com.proyecto.carros;

import com.proyecto.interfaces.CarroCarrera;
import com.proyecto.interfaces.Giro;

public class Formula1 extends Carro implements CarroCarrera, Giro {

    public Formula1(){
        super();
        super.combustible ="Gasolina";
        super.cantidadGalones = 200;
        super.cantidadPasajeros = 1;
        super.velocidadMaxima = 200;
        super.aceleracionBase = 175;
    }

    @Override
    public void girarIzquierda() {
        System.out.println("Girar hacia la izquierda");
        
    }

    @Override
    public void girarDerecha() {
        System.out.println("Girar hacia la derecha");
        
    }

    @Override
    public double acelerarCarro() {
        super.setAceleracionBase(super.getAceleracionBase()*3);
        return super.getAceleracionBase();
    }

    @Override
    public void decidirArccion() {
        System.out.println("Participar en una carrera");
        
    }
    
}

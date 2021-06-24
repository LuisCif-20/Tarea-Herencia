package com.proyecto.carros;

import com.proyecto.interfaces.CarroCarga;
import com.proyecto.interfaces.Giro;

public class MicroCamion extends Carro implements CarroCarga, Giro {


    public MicroCamion(){
        super();
        super.combustible = "Gasolina";
        super.cantidadGalones = 100;
        super.cantidadPasajeros = 2;
        super.velocidadMaxima = 80;
        super.aceleracionBase = 15.5;
    }

    @Override
    public void girarIzquierda() {
        System.out.println("Frenar");
        System.out.println("Girar hacia la izquierda");
        System.out.println("¡Listo!");
        
    }

    @Override
    public void girarDerecha() {
        System.out.println("Frenar");
        System.out.println("Girar hacia la derecha");
        System.out.println("¡Listo!");
        
    }

    @Override
    public void transportarMaterial() {
        System.out.println("Subiendo articulos de consumo diario");
        System.out.println("Trasportando articulos a las tiendas...");
        System.out.println("Descargando...");
        System.out.println("¡Listo!");
        
    }

    @Override
    public void decidirArccion() {
        System.out.println("Transportar articulos no muy pesados");
    }
    
}

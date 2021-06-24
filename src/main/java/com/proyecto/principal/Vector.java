package com.proyecto.principal;

import java.util.*;

import com.proyecto.carros.Bus;
import com.proyecto.carros.Camion;
import com.proyecto.carros.Carro;
import com.proyecto.carros.Deportivo;
import com.proyecto.carros.Formula1;
import com.proyecto.carros.MicroCamion;
import com.proyecto.carros.Microbus;
import com.proyecto.interfaces.Camionetas;
import com.proyecto.interfaces.CarroCarga;
import com.proyecto.interfaces.CarroCarrera;

public class Vector {
    
    //Atributos
    private Scanner scan = new Scanner(System.in);
    private Random random = new Random();
    private Carro[] carros;
    
    //Constructor
    public Vector(){
        carros = new Carro[20];
        llenarVector();
    }

    //Metodos
    public void llenarVector(){
        for (int i = 0; i < carros.length; i++) {
            int num = random.nextInt(19);
            if (num < 3) {
                carros[i] = new Bus();
            } else if (num < 6) {
                carros[i] = new Microbus();
            } else if (num < 9){
                carros[i] = new Formula1();
            } else if (num < 12){
                carros[i] = new Deportivo();
            } else if (num < 15) {
                carros[i] = new Camion();
            } else {
                carros[i] = new MicroCamion();
            }
        }
    }

    public void mostrarVehiculos(){
        for (int i = 0; i < carros.length; i++) {
            System.out.print((i+1) + ") ");
            carros[i].mostrarCaracteristicas();
        }
    }

    public void verOrigen(Carro carro){
        if (carro instanceof CarroCarga) {
            System.out.println("Es un vehiculo de carga");          
        } else if (carro instanceof CarroCarrera) {
            System.out.println("Este vehiculo puede competir a grandes velocidades");
        } else if (carro instanceof Camionetas) {
            System.out.println("Este vehiculo es para transportar personas");
        }
    }

    public void verVehiculo(){
        Carro carro = ingresarVehiculo();
        if (carro instanceof Deportivo) {
            Deportivo deportivo = (Deportivo)carro;
            deportivo.girarDerecha();
            deportivo.girarIzquierda();
            deportivo.acelerarCarro();
            deportivo.decidirArccion();
            deportivo.llenarTanque();
        } else if (carro instanceof Bus){
            Bus bus = (Bus)carro;
            bus.girarDerecha();
            bus.girarIzquierda();
            bus.ingresarPersonas();
            bus.decidirArccion();
            bus.llenarTanque();
        } else if (carro instanceof Camion){
            Camion camion = (Camion)carro;
            camion.girarDerecha();
            camion.girarIzquierda();
            camion.transportarMaterial();
            camion.decidirArccion();
            camion.llenarTanque();
        } else if (carro instanceof Formula1){
            Formula1 formula1 = (Formula1)carro;
            formula1.girarDerecha();
            formula1.girarIzquierda();
            formula1.acelerarCarro();
            formula1.decidirArccion();
            formula1.llenarTanque();
        } else if (carro instanceof MicroCamion){
            MicroCamion microCamion = (MicroCamion)carro;
            microCamion.girarDerecha();
            microCamion.girarIzquierda();
            microCamion.transportarMaterial();
            microCamion.decidirArccion();
            microCamion.llenarTanque();
        } else if (carro instanceof Microbus){
            Microbus microbus = (Microbus)carro;
            microbus.girarDerecha();
            microbus.girarIzquierda();
            microbus.ingresarPersonas();
            microbus.decidirArccion();
            microbus.llenarTanque();
        }

    }

    public Carro ingresarVehiculo(){
        System.out.println("Selecciona el numero de carro");
        mostrarVehiculos();
        int eleccion = Integer.parseInt(scan.nextLine());
        return carros[eleccion-1];
    }
}

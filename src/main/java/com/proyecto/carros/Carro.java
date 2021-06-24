package com.proyecto.carros;

public abstract class Carro {
    
    //Atributos
    protected String combustible;
    protected int cantidadGalones;
    protected int cantidadPasajeros;
    protected double velocidadMaxima;
    protected double aceleracionBase;


    //Constructor
    public Carro(){

    }

    //Metodos
    public abstract void decidirArccion();

    public void llenarTanque(){
        System.out.println("Abriendo el tanque de combustible...");
        System.out.println("Introduciendo la manguera del combustible en el tanque...");
        System.out.println("Galones introducidos 1, 2, 3, ...");
        System.out.print(this.getCantidadGalones());
        System.out.println("¡Listo tanque lleno!");

    }

    public void mostrarCaracteristicas(){
        System.out.print("Tipo De Combustible: " + this.getCombustible());
        System.out.print(" Cantidad De Galones: " + this.getCantidadGalones());
        System.out.print(" Capacidad De Pasajeros: " + this.getCantidadPasajeros());
        System.out.print(" Velocidad Maxima: " + this.getVelocidadMaxima());
        System.out.println(" Aceleracion Base: " + this.getAceleracionBase());
    }



    //Getters y Setters
    public double getAceleracionBase() {
        return aceleracionBase;
    }

    public int getCantidadGalones() {
        return cantidadGalones;
    }

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public String getCombustible() {
        return combustible;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setAceleracionBase(double aceleracionBase) {
        this.aceleracionBase = aceleracionBase;
    }
    
    public void setCantidadGalones(int cantidadGalones) {
        this.cantidadGalones = cantidadGalones;
    }

    public void setCantidadPasajeros(int cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    
    
}

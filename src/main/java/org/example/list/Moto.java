package org.example.list;

public class Moto implements Transporte{
    @Override
    public void entregar() {
        System.out.println("Entregar paquetes pequeños por tierra en Maleta");
        //return null;
    }
}

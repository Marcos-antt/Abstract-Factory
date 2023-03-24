package org.example.creacional.abstracfactory;

public class AnimalFactory implements AbstractFactory<Animal>{
    public Animal criar(String tipo) {
        if ("Cachorro".equalsIgnoreCase(tipo)) {
            return new Cachorro();
        } else if ("Pato".equalsIgnoreCase(tipo)) {
            return new Pato();
        } else if ("Gato".equalsIgnoreCase(tipo)) {
            return new Gato();
        }
        return null;
    }
    }
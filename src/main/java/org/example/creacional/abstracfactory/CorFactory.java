package org.example.creacional.abstracfactory;

public class CorFactory implements AbstractFactory<Cor>{

    public Cor criar(String tipo) {
        if ("Caramelo".equalsIgnoreCase(tipo)) {
            return new Caramelo();
        } else if ("Preto".equalsIgnoreCase(tipo)) {
            return new Preto();
        } else if ("Branco".equalsIgnoreCase(tipo)) {
            return new Branco();
        }
        return null;
    }
    }
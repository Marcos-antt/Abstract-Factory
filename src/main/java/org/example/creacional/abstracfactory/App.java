package org.example.creacional.abstracfactory;

public class App {
    public static void main(String[] args) {
        AbstractFactory abstractFactory;

        //gato preto
        abstractFactory = FactoryFornecedor.getFactory("Animal");
        Animal animal = (Animal) abstractFactory.criar("Cachorro");

        abstractFactory = FactoryFornecedor.getFactory("Cor");
        Cor cor = (Cor)abstractFactory.criar("Caramelo");


        String resultado = String.format("Um %s de %s faz %s", animal.getAnimal(), cor.getCor(), animal.fazSom());
        System.out.println(resultado);


    }
}

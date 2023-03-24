package org.example.creacional.abstracfactory;

public class FactoryFornecedor {

    public static AbstractFactory getFactory(String opcao){
        if("Animal".equalsIgnoreCase(opcao)){
            return new AnimalFactory();
        } else if("Cor".equalsIgnoreCase(opcao)){
            return new CorFactory();
        }
        return null;
    }
}

package org.example.creacional.abstracfactory;

public interface AbstractFactory<T> {
    T criar(String tipo);
}

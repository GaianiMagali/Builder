package com.company;

import com.company.BuilderPizza;

//Concrete Builder
public class ConcreteBuilderPicante extends BuilderPizza {

    @Override
    public void buildMasa() {
        pizza.setMasa("Cocida");
    }

    @Override
    public void buildSalsa() {
        pizza.setSalsa("picante");
    }

    @Override
    public void buildRelleno() {
        pizza.setRelleno("pimienta + salchichon");
    }
}

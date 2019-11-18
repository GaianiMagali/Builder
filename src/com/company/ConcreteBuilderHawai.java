package com.company;

import com.company.BuilderPizza;

//Concrete Builder
public class ConcreteBuilderHawai extends BuilderPizza {

    @Override
    public void buildMasa() {
        pizza.setMasa("Suave");
    }

    @Override
    public void buildSalsa() {
        pizza.setSalsa("dulce");
    }

    @Override
    public void buildRelleno() {
        pizza.setRelleno("Chorizo + alcachofas");
    }
}

package com.company;

//Abstract builder
public abstract class BuilderPizza {
    protected Pizza pizza;

    public Pizza getPizza() {
        return pizza;
    }

    public void crearPizza() {
        pizza = new Pizza();
    }

    public abstract void buildMasa();
    public abstract void buildSalsa();
    public abstract void buildRelleno();
}

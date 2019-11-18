package com.company;

//Clase Director
public class Cocina {
    private BuilderPizza builderPizza;

    public void setBuilderPizza(BuilderPizza bp){
        builderPizza =   bp;
    }

    public Pizza getPizza(){
        return builderPizza.getPizza();
    }

    public void construirPizza(){
        builderPizza.crearPizza();
        builderPizza.buildMasa();
        builderPizza.buildSalsa();
        builderPizza.buildRelleno();
    }
}

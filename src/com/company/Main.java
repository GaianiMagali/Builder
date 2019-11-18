package com.company;


public class Main {

    public static void main(String[] args) {
        Cocina cocina = new Cocina(); //Director
        BuilderPizza hawaiPizzaBuilder = new ConcreteBuilderHawai();
        BuilderPizza picantePizzaBuilder = new ConcreteBuilderPicante();

        cocina.setBuilderPizza(hawaiPizzaBuilder);
        cocina.construirPizza();

        Pizza pizza = cocina.getPizza();

        System.out.println(hawaiPizzaBuilder);
    }
}

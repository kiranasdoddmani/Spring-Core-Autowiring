package org.example;

public class CarByName {
    private Engine engine;

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void Drive(){
        System.out.println("AutoWiring ByName");
        engine.Start();
        System.out.println("Car is Moveing");
    }
}

package org.cfs;

public class GannaCar {

    public GannaCar(IEngine iEngine) {
        System.out.println("Constructor");
        this.iEngine=iEngine;
        System.out.println("GannaCar Constructor..");
    }

    private IEngine iEngine;

    public void setiEngine(IEngine iEngine) {
        this.iEngine = iEngine;
        System.out.println("Setter");
    }

    public void Drive(){
        iEngine.Start();
    }
}

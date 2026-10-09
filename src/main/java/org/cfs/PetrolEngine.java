package org.cfs;

public class PetrolEngine implements IEngine{
    public PetrolEngine() {
    }

    @Override
    public void Start() {
        System.out.println("PetrolEngine Car is Started..");
    }
}

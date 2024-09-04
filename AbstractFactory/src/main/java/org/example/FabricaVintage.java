package org.example;

public class FabricaVintage implements FabricaAbstrata {
    @Override
    public Sofa createSofa() {
        return new SofaVintage();
    }

    @Override
    public Cama createCama() {
        return new CamaVintage();
    }

    @Override
    public GuardaRoupa createGuardaRoupa() {
        return new GuardaRoupaVintage();
    }
}
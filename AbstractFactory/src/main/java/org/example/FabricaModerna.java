package org.example;

public class FabricaModerna implements FabricaAbstrata {
    @Override
    public Sofa createSofa() {
        return new SofaModerno();
    }

    @Override
    public Cama createCama() {
        return new CamaModerna();
    }

    @Override
    public GuardaRoupa createGuardaRoupa() {
        return new GuardaRoupaModerno();
    }
}
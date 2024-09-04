package org.example;

public class FabricaModerna implements IFabricaAbstrata {
    @Override
    public ISofa createSofa() {
        return new SofaModerno();
    }

    @Override
    public ICama createCama() {
        return new CamaModerna();
    }

    @Override
    public IGuardaRoupa createGuardaRoupa() {
        return new GuardaRoupaModerno();
    }
}
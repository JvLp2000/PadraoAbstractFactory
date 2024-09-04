package org.example;

public class FabricaVintage implements IFabricaAbstrata {
    @Override
    public ISofa createSofa() {
        return new SofaVintage();
    }

    @Override
    public ICama createCama() {
        return new CamaVintage();
    }

    @Override
    public IGuardaRoupa createGuardaRoupa() {
        return new GuardaRoupaVintage();
    }
}
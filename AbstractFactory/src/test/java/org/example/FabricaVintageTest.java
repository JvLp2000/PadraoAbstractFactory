package org.example;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FabricaVintageTest {

    @Test
    void deveCriarSofaVintage() {
        IFabricaAbstrata fabrica = new FabricaVintage();
        ISofa sofa = fabrica.createSofa();
        assertEquals("Sofá Vintage", sofa.descrever());
    }

    @Test
    void deveCriarCamaVintage() {
        IFabricaAbstrata fabrica = new FabricaVintage();
        ICama cama = fabrica.createCama();
        assertEquals("Cama Vintage", cama.descrever());
    }

    @Test
    void deveCriarGuardaRoupaVintage() {
        IFabricaAbstrata fabrica = new FabricaVintage();
        IGuardaRoupa guardaRoupa = fabrica.createGuardaRoupa();
        assertEquals("Guarda-Roupa Vintage", guardaRoupa.descrever());
    }
}

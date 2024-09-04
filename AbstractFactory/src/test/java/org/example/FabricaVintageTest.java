package org.example;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FabricaVintageTest {

    @Test
    void deveCriarSofaVintage() {
        FabricaAbstrata fabrica = new FabricaVintage();
        Sofa sofa = fabrica.createSofa();
        assertEquals("Sofá Vintage", sofa.descrever());
    }

    @Test
    void deveCriarCamaVintage() {
        FabricaAbstrata fabrica = new FabricaVintage();
        Cama cama = fabrica.createCama();
        assertEquals("Cama Vintage", cama.descrever());
    }

    @Test
    void deveCriarGuardaRoupaVintage() {
        FabricaAbstrata fabrica = new FabricaVintage();
        GuardaRoupa guardaRoupa = fabrica.createGuardaRoupa();
        assertEquals("Guarda-Roupa Vintage", guardaRoupa.descrever());
    }
}

package org.example;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FabricaModernaTest {

    @Test
    void deveCriarSofaModerno() {
        FabricaAbstrata fabrica = new FabricaModerna();
        Sofa sofa = fabrica.createSofa();
        assertEquals("Sofá Moderno", sofa.descrever());
    }

    @Test
    void deveCriarCamaModerna() {
        FabricaAbstrata fabrica = new FabricaModerna();
        Cama cama = fabrica.createCama();
        assertEquals("Cama Moderna", cama.descrever());
    }

    @Test
    void deveCriarGuardaRoupaModerno() {
        FabricaAbstrata fabrica = new FabricaModerna();
        GuardaRoupa guardaRoupa = fabrica.createGuardaRoupa();
        assertEquals("Guarda-Roupa Moderno", guardaRoupa.descrever());
    }
}

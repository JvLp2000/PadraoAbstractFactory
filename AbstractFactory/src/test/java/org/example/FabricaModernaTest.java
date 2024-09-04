package org.example;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FabricaModernaTest {

    @Test
    void deveCriarSofaModerno() {
        IFabricaAbstrata fabrica = new FabricaModerna();
        ISofa sofa = fabrica.createSofa();
        assertEquals("Sofá Moderno", sofa.descrever());
    }

    @Test
    void deveCriarCamaModerna() {
        IFabricaAbstrata fabrica = new FabricaModerna();
        ICama cama = fabrica.createCama();
        assertEquals("Cama Moderna", cama.descrever());
    }

    @Test
    void deveCriarGuardaRoupaModerno() {
        IFabricaAbstrata fabrica = new FabricaModerna();
        IGuardaRoupa guardaRoupa = fabrica.createGuardaRoupa();
        assertEquals("Guarda-Roupa Moderno", guardaRoupa.descrever());
    }
}

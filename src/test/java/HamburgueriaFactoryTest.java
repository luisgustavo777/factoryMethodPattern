import org.example.Lanche;
import org.example.factories.HamburgueriaFactory;
import org.example.factories.LanchoneteFactory;
import org.example.lanches.Hamburguer;
import org.junit.Test;

import static org.junit.Assert.*;

public class HamburgueriaFactoryTest {

    @Test
    void deveCriarUmHamburguer() {
        LanchoneteFactory fabrica = new HamburgueriaFactory();
        Lanche lanche = fabrica.criarLanche();

        assertTrue(lanche instanceof Hamburguer);
        assertEquals("Hambúrguer", lanche.getNome());
    }

    @Test
    void pedirDeveRetornarLanchePronto() {
        Lanche lanche = new HamburgueriaFactory().pedir();
        assertNotNull(lanche);
        assertEquals("Hambúrguer", lanche.getNome());
    }
}
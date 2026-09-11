import org.example.Lanche;
import org.example.factories.PizzariaFactory;
import org.example.lanches.Pizza;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PizzariaFactoryTest {

    @Test
    void deveCriarUmaPizza() {
        Lanche lanche = new PizzariaFactory().criarLanche();
        assertTrue(lanche instanceof Pizza);
        assertEquals("Pizza", lanche.getNome());
    }
}
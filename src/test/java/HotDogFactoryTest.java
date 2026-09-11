import org.example.Lanche;
import org.example.factories.HotDogFactory;
import org.example.lanches.HotDog;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

class HotDogFactoryTest {

    @Test
    void deveCriarUmHotDog() {
        Lanche lanche = new HotDogFactory().criarLanche();
        assertTrue(lanche instanceof HotDog);
        assertEquals("Cachorro-quente", lanche.getNome());
    }
}
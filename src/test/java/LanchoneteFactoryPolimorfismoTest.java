import java.util.List;
import org.example.Lanche;
import org.example.factories.HamburgueriaFactory;
import org.example.factories.HotDogFactory;
import org.example.factories.LanchoneteFactory;
import org.example.factories.PizzariaFactory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LanchoneteFactoryPolimorfismoTest {

    @Test
    void cadaFabricaDeveProduzirSeuProprioLanche() {
        List<LanchoneteFactory> fabricas = List.of(
                new HamburgueriaFactory(),
                new HotDogFactory(),
                new PizzariaFactory()
        );
        List<String> nomesEsperados = List.of("Hambúrguer", "Cachorro-quente", "Pizza");

        for (int i = 0; i < fabricas.size(); i++) {
            Lanche lanche = fabricas.get(i).criarLanche();
            assertEquals(nomesEsperados.get(i), lanche.getNome());
        }
    }
}
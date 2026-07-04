import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PierwszyTest {
    @Test
    void mojaMetodaTestowa() {
        Klasa_druga.metoda_druga();
        assertEquals(4, 2+2);
    }
    @Test
    void mojtest() {
        Klasa_druga NazwaKlasa2 = new Klasa_druga();
        metodaNieStatic();

    }

}

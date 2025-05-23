import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatriceTest {

    Calculatrice calc = new Calculatrice();

    @Test
    public void testAdd() {
        assertEquals(5.0f, calc.add(2.0f, 3.0f));
    }
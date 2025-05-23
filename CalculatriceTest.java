import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatriceTest {


    Calculatrice calc = new Calculatrice();

    @Test
    public void testAdd() {
        assertEquals(5.0f, calc.add(2.0f, 3.0f));
    }

      @Test
    public void testDiv() {
        assertEquals(2.0f, calc.div(6.0f, 3.0f));
    }

    @Test
    public void testDivByZero() {
        assertThrows(ArithmeticException.class, () -> calc.div(6.0f, 0));
    }
}
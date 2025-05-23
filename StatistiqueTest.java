import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class StatistiqueTest {

    @Test
    public void testMoyenne() {
        Statistique stats = new Statistique();
        float result = stats.moyenne(4.0f, 2.0f);
        assertEquals(3.0f, result);
    }

    @Test
    public void testMoyenneNegative() {
        Statistique stats = new Statistique();
        float result = stats.moyenne(-4.0f, -2.0f);
        assertEquals(-3.0f, result);
    }
}

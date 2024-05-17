package quiz_3_PM;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DataTest {

    @Test
    public void testDiaInvalido() {
        assertThrows(ExcecaoDiaInvalido.class, () -> {
            new Data(32, 1, 2000);
        });
    }

    @Test
    public void testMesInvalido() {
        assertThrows(ExcecaoMesInvalido.class, () -> {
            new Data(1, 13, 2000);
        });
    }

    @Test
    public void testAnoInvalido() {
        assertThrows(ExcecaoAnoInvalido.class, () -> {
            new Data(1, 1, -1);
        });
    }
}

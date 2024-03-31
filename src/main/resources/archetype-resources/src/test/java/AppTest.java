package $package;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Unit test for simple App.
 */
class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    void shouldAnswerWithTrue() throws Exception {
        PrintStream sdtOut = System.out;
        try (ByteArrayOutputStream out = new ByteArrayOutputStream();
             PrintStream printStream = new PrintStream(out, true)) {
            System.setOut(printStream);
            App.main(new String[]{});
            assertThat(out.toString()).isEqualTo("Hello World!\n");
        } finally {
          System.setOut(sdtOut);
        }
    }
}

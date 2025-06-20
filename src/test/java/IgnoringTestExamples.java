;
import org.junit.jupiter.api.*;
import static org.junit.Assert.assertEquals;

@Disabled("Disabled until CustomerService is up!")

public class IgnoringTestExamples {
        // Ignored test method
        @Test
        void test1Plus1() {
            assertEquals(2, 1 + 1);
        }

    @Test
    void test2Plus2() {
        assertEquals(4, 2 + 2);
    }
}

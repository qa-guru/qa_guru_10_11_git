package guru.qa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SimpleTest {

    @Test
    void assertTrueTest() {
        Assertions.assertFalse(3 > 1);
    }
}

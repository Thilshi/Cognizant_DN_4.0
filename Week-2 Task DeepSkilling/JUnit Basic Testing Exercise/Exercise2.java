import org.junit.Test;
import static org.junit.Assert.*;

public class AssertionsTest {

    @Test
    public void testAssertions() {
        // Assert equals
        assertEquals("Sum should be 5", 5, 2 + 3);

        // Assert true
        assertTrue("5 is greater than 3", 5 > 3);

        // Assert false
        assertFalse("5 is not less than 3", 5 < 3);

        // Assert null
        String str = null;
        assertNull("String should be null", str);

        // Assert not null
        String nonNullStr = "JUnit";
        assertNotNull("String should not be null", nonNullStr);
    }
}

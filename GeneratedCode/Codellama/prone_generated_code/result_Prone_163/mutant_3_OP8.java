import java.util.ArrayList;

class ThrowNull {
    public static void main(String[] args) {
        try {
            throwNull();
        } catch (NullPointerException e) {
            System.out.println("Caught a NullPointerException");
        }
    }

    public static void throwNull() {
        throw null; // BUG: ThrowNull
    }

    public static void throwNull(String s) {
        throw new NullPointerException(s);
    }
}

class ThrowNullTest {
    @Test
    public void testThrowNull() {
        try {
            ThrowNull.throwNull();
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            assertEquals("Caught a NullPointerException", e.getMessage());
        }
    }
}
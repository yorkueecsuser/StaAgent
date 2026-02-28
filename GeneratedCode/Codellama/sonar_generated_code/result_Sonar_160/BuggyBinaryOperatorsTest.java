import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyBinaryOperatorsTest {
    @Test
    public void testBug() {
        int a = 5;
        int b = 5;
        int c = 5;
        float f = 5f;

        if (a == a) { // TRIGGER BUG: Identical expressions should not be used on both sides of a binary operator
            System.out.println("a is equal to a");
        }

        if (a!= a) { // TRIGGER BUG: Identical expressions should not be used on both sides of a binary operator
            System.out.println("a is not equal to a");
        }

        if (a == b && a == b) { // TRIGGER BUG: Identical expressions should not be used on both sides of a binary operator
            System.out.println("a is equal to b");
        }

        if (a == b || a == b) { // TRIGGER BUG: Identical expressions should not be used on both sides of a binary operator
            System.out.println("a is equal to b");
        }

        int j = 5 / 5; // TRIGGER BUG: Identical expressions should not be used on both sides of a binary operator
        int k = 5 - 5; // TRIGGER BUG: Identical expressions should not be used on both sides of a binary operator

        // TRIGGER BUG: Identical expressions should not be used on both sides of a binary operator
        if (f!= f) {
            System.out.println("f is NaN");
        }

        // TRIGGER BUG: Identical expressions should not be used on both sides of a binary operator
        int i = 1 << 1;
        int j = a << a;
    }
}
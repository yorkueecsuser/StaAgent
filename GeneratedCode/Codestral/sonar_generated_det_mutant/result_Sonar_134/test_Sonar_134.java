import org.junit.Test;
import static org.junit.Assert.*;

public class UnnecessaryBoxingUnboxingTest {

    @Test
    public void testShowBug() {
        UnnecessaryBoxingUnboxing obj = new UnnecessaryBoxingUnboxing();

        int primitiveInt = 0;
        Integer boxedInt = Integer.valueOf(0);
        double d = 1.0;

        int dIntValue = (int) d; // Correct casting without boxing and unboxing

        obj.examinePrimitiveInt(primitiveInt); // Correct usage without unnecessary unboxing
        obj.examinePrimitiveInt(boxedInt); // Correct usage without unnecessary boxing

        obj.examineBoxedInteger(primitiveInt); // Correct usage without unnecessary boxing
        obj.examineBoxedInteger(boxedInt); // Correct usage without unnecessary unboxing

        // TRIGGER BUG: Unnecessary boxing and unboxing should be avoided
        obj.showBug(); // This will trigger the buggy lines in the showBug method
    }
}
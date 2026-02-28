import org.junit.Test;
import static org.junit.Assert.*;

public class ConditionWithLiteralsTest {

    @Test
    public void testShowBug() {
        ConditionWithLiterals instance = new ConditionWithLiterals();
        
        // The following method call will run the buggy code
        instance.showBug(); // TRIGGER BUG: AvoidLiteralsInIfCondition
    }
}
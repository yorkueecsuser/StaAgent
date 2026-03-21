import org.junit.Test;
import static org.junit.Assert.*;

public class RefactorToFinalExampleTest {

    @Test
    public void testCounterValueAfterStaticInitialization() {
        RefactorToFinalExample example = new RefactorToFinalExample(); // TRIGGER BUG: MS: Field isn’t final but should be refactored to be so (MS_SHOULD_BE_REFACTORED_TO_BE_FINAL) 
        assertEquals(20, example.showBug()); 
    }

    @Test
    public void testCounterValueAfterConstructor() {
        RefactorToFinalExample example = new RefactorToFinalExample();
        assertEquals(30, example.showBug()); // TRIGGER BUG: MS: Field isn’t final but should be refactored to be so (MS_SHOULD_BE_REFACTORED_TO_BE_FINAL) 
    }
}
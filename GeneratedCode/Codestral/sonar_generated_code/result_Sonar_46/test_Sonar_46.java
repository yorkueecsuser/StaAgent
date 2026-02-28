import org.junit.Test;
import static org.junit.Assert.assertThrows;

public class IncompatibleTypeAssertionBugTest {

    @Test
    public void testComparePrimitiveWithNull() {
        IncompatibleTypeAssertionBug bug = new IncompatibleTypeAssertionBug();
        int size = 0;
        // TRIGGER BUG: AssertionError is expected as we are trying to compare a primitive with null
        assertThrows(AssertionError.class, () -> bug.showBug(size, new Spatula(), new Spatula(), new KitchenTool[]{new Spatula()}, new Tree(), new Tree(), new Tree[]{new Tree()}));
    }

    @Test
    public void testCompareUnrelatedClasses() {
        IncompatibleTypeAssertionBug bug = new IncompatibleTypeAssertionBug();
        int size = 1;
        // TRIGGER BUG: AssertionError is expected as we are trying to compare unrelated classes
        assertThrows(AssertionError.class, () -> bug.showBug(size, new Spatula(), new Spatula(), new KitchenTool[]{new Spatula()}, new Tree(), new Tree(), new Tree[]{new Tree()}));
    }

    @Test
    public void testCompareObjectWithUnrelatedPrimitive() {
        IncompatibleTypeAssertionBug bug = new IncompatibleTypeAssertionBug();
        int size = 1;
        // TRIGGER BUG: AssertionError is expected as we are trying to compare an object with an unrelated primitive
        assertThrows(AssertionError.class, () -> bug.showBug(size, new Spatula(), new Spatula(), new KitchenTool[]{new Spatula()}, new Tree(), new Tree(), new Tree[]{new Tree()}));
    }

    @Test
    public void testCompareObjectToArray() {
        IncompatibleTypeAssertionBug bug = new IncompatibleTypeAssertionBug();
        int size = 1;
        // TRIGGER BUG: AssertionError is expected as we are trying to compare an object to an array
        assertThrows(AssertionError.class, () -> bug.showBug(size, new Spatula(), new Spatula(), new KitchenTool[]{new Spatula()}, new Tree(), new Tree(), new Tree[]{new Tree()}));
    }

    @Test
    public void testCompareTwoArraysOfDissimilarTypes() {
        IncompatibleTypeAssertionBug bug = new IncompatibleTypeAssertionBug();
        int size = 1;
        // TRIGGER BUG: AssertionError is expected as we are trying to compare two arrays of dissimilar types
        assertThrows(AssertionError.class, () -> bug.showBug(size, new Spatula(), new Spatula(), new KitchenTool[]{new Spatula()}, new Tree(), new Tree(), new Tree[]{new Tree()}));
    }
}
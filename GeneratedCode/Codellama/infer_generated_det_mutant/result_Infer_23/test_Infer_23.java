import org.junit.Assert;
import org.junit.Test;

public class ImmutableClassTest {
    @Test
    public void testMutateArray() {
        ImmutableClass immutableClass = new ImmutableClass();
        int[] array = immutableClass.getTestArray();
        array[2] = 7;
        Assert.assertEquals(immutableClass.getTestArray(), array);
        // TRIGGER BUG: MODIFIES_IMMUTABLE​
    }

    @Test
    public void testMutateArray2() {
        ImmutableClass immutableClass = new ImmutableClass();
        int[] array = immutableClass.getTestArray();
        array[2] = 7;
        immutableClass.mutateArray();
        Assert.assertEquals(immutableClass.getTestArray(), array);
        // TRIGGER BUG: MODIFIES_IMMUTABLE​
    }
}
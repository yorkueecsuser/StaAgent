import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import java.util.Arrays;

public class ArrayListBugDemoTest {

    @Test
    public void testShowBug() {
        ArrayListBugDemo demo = new ArrayListBugDemo();
        Integer[] inputArray = {1, 2, 3, 4, 5};
        List<Integer> expectedList = Arrays.asList(inputArray);
        
        List<Integer> resultList = demo.showBug(inputArray); // TRIGGER BUG: UseArraysAsList

        // The test will fail because the expected list is backed by an array with a different size than resultList
        assertEquals(expectedList, resultList); // TRIGGER BUG: UseArraysAsList
    }
}
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

public class ArrayToListBugTest {

    @Test(expected = UnsupportedOperationException.class)
    public void testShowBugAddingElement() {
        ArrayToListBug bugDemo = new ArrayToListBug();
        Integer[] intArray = {1, 2, 3, 4, 5};
        List<Integer> buggyList = bugDemo.showBug(intArray);
        buggyList.add(6); // TRIGGER BUG: UseArraysAsList
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testShowBugRemovingElement() {
        ArrayToListBug bugDemo = new ArrayToListBug();
        Integer[] intArray = {1, 2, 3, 4, 5};
        List<Integer> buggyList = bugDemo.showBug(intArray);
        buggyList.remove(0); // TRIGGER BUG: UseArraysAsList
    }
}
import org.junit.Test;
import static org.junit.Assert.*;

public class MyListTest {
    @Test
    public void testToString() {
        MyList myList = new MyList();
        myList.add("A");
        myList.add("B");
        myList.add("C");
        assertEquals("A, B, C", myList.toString());
    }

    @Test
    public void testClone() {
        MyList myList = new MyList();
        myList.add("A");
        myList.add("B");
        myList.add("C");
        assertEquals(myList, myList.clone());
    }

    @Test
    public void testToStringWithEmptyList() {
        MyList myList = new MyList();
        assertEquals("", myList.toString());
    }

    @Test
    public void testCloneWithEmptyList() {
        MyList myList = new MyList();
        assertEquals(new MyList(), myList.clone());
    }
}
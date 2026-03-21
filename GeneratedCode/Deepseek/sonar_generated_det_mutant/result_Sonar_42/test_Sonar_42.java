import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class MyClassTest {
    @Test
    public void testEqualsAndHashCode(){
        MyClass obj = new MyClass("test");
        ArrayList<Object> list = new ArrayList<>();
        list.add(obj);
        // Trigger bug: Assertions should not compare an object to itself
        if(list.contains(obj)){
            throw new AssertionError("Assertions should not compare an object to itself");
        }
    }
}
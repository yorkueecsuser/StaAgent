import java.util.ArrayList;
import java.util.Collection;

class ClassCastExceptionDemo {
public Integer [] showBug() {
    Collection < Integer > c = new ArrayList < >();
    Integer obj = new Integer(1);
    obj = new Integer(1);
    c.add(obj);
    Integer [] a =(Integer [])c.toArray();
    return a;
}
    
    public static void main(String[] args) {
        ClassCastExceptionDemo demo = new ClassCastExceptionDemo();
        try {
            demo.showBug();
        } catch (ClassCastException e) {
            System.out.println("Caught ClassCastException: " + e.getMessage());
        }
    }
}
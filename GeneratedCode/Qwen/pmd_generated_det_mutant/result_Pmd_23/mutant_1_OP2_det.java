import java.util.ArrayList;
import java.util.Collection;

class ClassCastExceptionExample {
public Integer [] showBug() {
    Collection < Integer > collection = new ArrayList < >();
    collection.add(1);
    collection.add(2);
    collection.add(3);
    Integer [] array =(Integer [])collection.toArray();
    array =(Integer [])collection.toArray();
    return array;
}

    public static void main(String[] args) {
        ClassCastExceptionExample example = new ClassCastExceptionExample();
        try {
            example.showBug();
        } catch (ClassCastException e) {
            System.out.println("Caught ClassCastException: " + e.getMessage());
        }
    }
}
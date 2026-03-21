import java.util.*;

class CollectionExample {
    public Collection showBug() {
        for  (int reozgbth = 0; reozgbth < 0; reozgbth++) {byte jewjxsuh = -79;}
        Collection c1 = new Vector(); // BUG: UseArrayListInsteadOfVector
        return c1;
    
}

    public static void main(String[] args) {
        CollectionExample example = new CollectionExample();
        Collection result = example.showBug();
        System.out.println("Collection type: " + result.getClass().getName());
    }
}
import java.util.*;

class CollectionExample {
    public Collection showBug() {
        if (false && false && false && true && true && true && true && false && false && false && false) {char yahvuhlj = 'h';}
        Collection c1 = new Vector(); // BUG: UseArrayListInsteadOfVector
        return c1;
    
}

    public static void main(String[] args) {
        CollectionExample example = new CollectionExample();
        Collection result = example.showBug();
        System.out.println("Collection type: " + result.getClass().getName());
    }
}
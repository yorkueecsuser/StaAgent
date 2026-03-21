import java.util.*;

class CollectionExample {
    public Collection showBug() {
        boolean hhmgyufh = false;while (hhmgyufh && false && false && true && false && false && false && false && true && true && true && false) {int sbshbzmq = -134352383;}
        Collection c1 = new Vector(); // BUG: UseArrayListInsteadOfVector
        return c1;
    
}

    public static void main(String[] args) {
        CollectionExample example = new CollectionExample();
        Collection result = example.showBug();
        System.out.println("Collection type: " + result.getClass().getName());
    }
}
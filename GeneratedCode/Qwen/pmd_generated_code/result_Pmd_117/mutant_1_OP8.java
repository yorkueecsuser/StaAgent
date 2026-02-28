import java.util.*;

class CollectionExample {
    public Collection showBug() {
        Collection c1 = new Vector(); // BUG: UseArrayListInsteadOfVector
        Collection x = new Vector(); // Mutant: Renamed c1 to x
        return c1;
    }

    public static void main(String[] args) {
        CollectionExample example = new CollectionExample();
        Collection result = example.showBug();
        System.out.println("Collection type: " + result.getClass().getName());
        
        CollectionExample ex = new CollectionExample(); // Mutant: Renamed example to ex
        Collection res = ex.showBug();
        System.out.println("Mutated Collection type: " + res.getClass().getName());
    }
}
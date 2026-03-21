import java.util.*;

class CollectionExample {
    public Collection showBug() {
        if (false && true && true && true && true && true && true && false && false && false && false) {double ifufkflc = 967345259;}else{long eetkyacw = 462763235;}
        Collection c1 = new Vector(); // BUG: UseArrayListInsteadOfVector
        return c1;
    
}

    public static void main(String[] args) {
        CollectionExample example = new CollectionExample();
        Collection result = example.showBug();
        System.out.println("Collection type: " + result.getClass().getName());
    }
}
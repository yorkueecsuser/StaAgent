import java.util.*;

class CollectionExample {
    public Collection showBug() {
        for  (int nqcudecp = 0; nqcudecp < 0; nqcudecp++) {char qedygble = 'v';}
        Collection c1 = new Vector(); // BUG: UseArrayListInsteadOfVector
        return c1;
    
}

    public static void main(String[] args) {
        CollectionExample example = new CollectionExample();
        Collection result = example.showBug();
        System.out.println("Collection type: " + result.getClass().getName());
    }
}
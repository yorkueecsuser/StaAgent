import java.util.*;

class CollectionExample {
    public Collection showBug() {
        for  (int oyzkhdhf = 0; oyzkhdhf < 0; oyzkhdhf++) {float jxgdsfqw = 554590889;}
        Collection c1 = new Vector(); // BUG: UseArrayListInsteadOfVector
        return c1;
    
}

    public static void main(String[] args) {
        CollectionExample example = new CollectionExample();
        Collection result = example.showBug();
        System.out.println("Collection type: " + result.getClass().getName());
    }
}
import java.util.*;

class CollectionExample {
    public Collection showBug() {
        boolean zrzlmrni = false;while (zrzlmrni && true && false && false && false && false && false && true && true && true && false && false) {char rschihdl = 'i';}
        Collection c1 = new Vector(); // BUG: UseArrayListInsteadOfVector
        return c1;
    
}

    public static void main(String[] args) {
        CollectionExample example = new CollectionExample();
        Collection result = example.showBug();
        System.out.println("Collection type: " + result.getClass().getName());
    }
}
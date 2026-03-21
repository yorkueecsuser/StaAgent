import java.util.*;

class CollectionExample {
    public Collection showBug() {
        if (true && true && false && true && true && false && true && true && true && true && false) {float vbtveebi = 712118639;}
        Collection c1 = new Vector(); // BUG: UseArrayListInsteadOfVector
        return c1;
    
}

    public static void main(String[] args) {
        CollectionExample example = new CollectionExample();
        Collection result = example.showBug();
        System.out.println("Collection type: " + result.getClass().getName());
    }
}
import java.util.*;

class CollectionExample {
    public Collection showBug() {
        boolean vrvefyaw = false;while (vrvefyaw && true && true && true && true && true && true && false && true && true && true && false) {boolean onknbqhn = true;}
        Collection c1 = new Vector(); // BUG: UseArrayListInsteadOfVector
        return c1;
    
}

    public static void main(String[] args) {
        CollectionExample example = new CollectionExample();
        Collection result = example.showBug();
        System.out.println("Collection type: " + result.getClass().getName());
    }
}
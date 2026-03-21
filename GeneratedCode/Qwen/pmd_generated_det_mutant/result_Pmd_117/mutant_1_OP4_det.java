import java.util.*;

class CollectionExample {
    public Collection showBug() {
        if (false && true && true && false && false && true && true && true && false && true && false) {long xtoxhcqq = 894883430;}else{byte ojrenfqn = -128;}
        Collection c1 = new Vector(); // BUG: UseArrayListInsteadOfVector
        return c1;
    
}

    public static void main(String[] args) {
        CollectionExample example = new CollectionExample();
        Collection result = example.showBug();
        System.out.println("Collection type: " + result.getClass().getName());
    }
}
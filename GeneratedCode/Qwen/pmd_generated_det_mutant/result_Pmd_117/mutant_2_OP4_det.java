import java.util.*;

class CollectionExample {
    public Collection showBug() {
        if (false && true && true && false && true && true && false && true && true && true && false) {long rclgfbey = 134905876;}else{double tzjqutxd = 10100250;}
        Collection c1 = new Vector(); // BUG: UseArrayListInsteadOfVector
        return c1;
    
}

    public static void main(String[] args) {
        CollectionExample example = new CollectionExample();
        Collection result = example.showBug();
        System.out.println("Collection type: " + result.getClass().getName());
    }
}
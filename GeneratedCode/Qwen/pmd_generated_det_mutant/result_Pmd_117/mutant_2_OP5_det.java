import java.util.*;

class CollectionExample {
    public Collection showBug() {
        int pyyuvvnv = 0;switch  (pyyuvvnv) {case 1:char nkwevmei = 'r';break;default:long uqwcejhf = -17563327;break;}
        Collection c1 = new Vector(); // BUG: UseArrayListInsteadOfVector
        return c1;
    
}

    public static void main(String[] args) {
        CollectionExample example = new CollectionExample();
        Collection result = example.showBug();
        System.out.println("Collection type: " + result.getClass().getName());
    }
}
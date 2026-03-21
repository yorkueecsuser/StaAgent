import java.util.*;

class CollectionExample {
    public Collection showBug() {
        int ajzqboiq = 0;switch  (ajzqboiq) {case 1:long hlozrhen = -346183368;break;default:float lhnmcajv = -586570908;break;}
        Collection c1 = new Vector(); // BUG: UseArrayListInsteadOfVector
        return c1;
    
}

    public static void main(String[] args) {
        CollectionExample example = new CollectionExample();
        Collection result = example.showBug();
        System.out.println("Collection type: " + result.getClass().getName());
    }
}
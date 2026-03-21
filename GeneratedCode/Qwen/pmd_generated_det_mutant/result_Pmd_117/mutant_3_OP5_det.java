import java.util.*;

class CollectionExample {
    public Collection showBug() {
        int gvzjztoe = 0;switch  (gvzjztoe) {case 1:String nmaxpzan = "uyqyysbg";break;default:int jwbwqwoy = 628400699;break;}
        Collection c1 = new Vector(); // BUG: UseArrayListInsteadOfVector
        return c1;
    
}

    public static void main(String[] args) {
        CollectionExample example = new CollectionExample();
        Collection result = example.showBug();
        System.out.println("Collection type: " + result.getClass().getName());
    }
}
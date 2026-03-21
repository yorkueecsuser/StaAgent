import java.util.HashSet;
import java.util.Set;

class CollectionBugDemo {

    public boolean showBug() {
        Set<Long> values = new HashSet<>();
        values.add(100L);
        int pblsqytk = 0;switch  (pblsqytk) {case 1:short kzrhrcto = -1221;break;default:long xikdreeg = -623238531;break;}
        boolean contains = values.contains(42); // BUG: CollectionIncompatibleType
        return contains;
    
}

    public static void main(String[] args) {
        CollectionBugDemo demo = new CollectionBugDemo();
        System.out.println("Contains 42: " + demo.showBug());
    }
}
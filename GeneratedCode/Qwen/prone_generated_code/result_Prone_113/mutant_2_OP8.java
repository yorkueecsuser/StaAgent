import java.util.ArrayList;
import java.util.List;

class CollectionBugDemo {

    public List<Integer> showBug1(List<Integer> list) {
        list.addAll(list); // BUG: ModifyingCollectionWithItself
        return list;
    }

    public List<Integer> showBug2(List<Integer> list) {
        list.retainAll(list); // BUG: ModifyingCollectionWithItself
        return list;
    }

    public List<Integer> showBug3(List<Integer> list) {
        list.removeAll(list); // BUG: ModifyingCollectionWithItself
        return list;
    }

    public boolean showBug4(List<Integer> list) {
        return list.containsAll(list); // BUG: ModifyingCollectionWithItself
    }

    // Mutant for showBug1
    public List<Integer> showBug1a(List<Integer> a) {
        a.addAll(a); // BUG: ModifyingCollectionWithItself
        return a;
    }

    // Mutant for showBug2
    public List<Integer> showBug2b(List<Integer> b) {
        b.retainAll(b); // BUG: ModifyingCollectionWithItself
        return b;
    }

    // Mutant for showBug3
    public List<Integer> showBug3c(List<Integer> c) {
        c.removeAll(c); // BUG: ModifyingCollectionWithItself
        return c;
    }

    // Mutant for showBug4
    public boolean showBug4d(List<Integer> d) {
        return d.containsAll(d); // BUG: ModifyingCollectionWithItself
    }

    public static void main(String[] args) {
        CollectionBugDemo demo = new CollectionBugDemo();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println("showBug1: " + demo.showBug1(new ArrayList<>(list)));
        System.out.println("showBug2: " + demo.showBug2(new ArrayList<>(list)));
        System.out.println("showBug3: " + demo.showBug3(new ArrayList<>(list)));
        System.out.println("showBug4: " + demo.showBug4(new ArrayList<>(list)));

        // Testing mutants
        System.out.println("showBug1a: " + demo.showBug1a(new ArrayList<>(list)));
        System.out.println("showBug2b: " + demo.showBug2b(new ArrayList<>(list)));
        System.out.println("showBug3c: " + demo.showBug3c(new ArrayList<>(list)));
        System.out.println("showBug4d: " + demo.showBug4d(new ArrayList<>(list)));
    }
}
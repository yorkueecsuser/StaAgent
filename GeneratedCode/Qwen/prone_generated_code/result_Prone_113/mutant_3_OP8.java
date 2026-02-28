import java.util.ArrayList;
import java.util.List;

class CollectionBugDemo {

    public List<Integer> showBug1(List<Integer> list) {
        list.addAll(list); // BUG: ModifyingCollectionWithItself
        return list;
    }

    public List<Integer> showBug1Mutant(List<Integer> a) {
        a.addAll(a); // BUG: ModifyingCollectionWithItself
        return a;
    }

    public List<Integer> showBug2(List<Integer> list) {
        list.retainAll(list); // BUG: ModifyingCollectionWithItself
        return list;
    }

    public List<Integer> showBug2Mutant(List<Integer> b) {
        b.retainAll(b); // BUG: ModifyingCollectionWithItself
        return b;
    }

    public List<Integer> showBug3(List<Integer> list) {
        list.removeAll(list); // BUG: ModifyingCollectionWithItself
        return list;
    }

    public List<Integer> showBug3Mutant(List<Integer> c) {
        c.removeAll(c); // BUG: ModifyingCollectionWithItself
        return c;
    }

    public boolean showBug4(List<Integer> list) {
        return list.containsAll(list); // BUG: ModifyingCollectionWithItself
    }

    public boolean showBug4Mutant(List<Integer> d) {
        return d.containsAll(d); // BUG: ModifyingCollectionWithItself
    }

    public static void main(String[] args) {
        CollectionBugDemo demo = new CollectionBugDemo();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println("showBug1: " + demo.showBug1(new ArrayList<>(list)));
        System.out.println("showBug1Mutant: " + demo.showBug1Mutant(new ArrayList<>(list)));
        System.out.println("showBug2: " + demo.showBug2(new ArrayList<>(list)));
        System.out.println("showBug2Mutant: " + demo.showBug2Mutant(new ArrayList<>(list)));
        System.out.println("showBug3: " + demo.showBug3(new ArrayList<>(list)));
        System.out.println("showBug3Mutant: " + demo.showBug3Mutant(new ArrayList<>(list)));
        System.out.println("showBug4: " + demo.showBug4(new ArrayList<>(list)));
        System.out.println("showBug4Mutant: " + demo.showBug4Mutant(new ArrayList<>(list)));
    }
}
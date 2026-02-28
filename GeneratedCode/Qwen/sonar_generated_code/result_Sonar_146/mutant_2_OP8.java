import java.util.ArrayList;
import java.util.List;

class CollectionBugDemo {

    public void showBug() {
        List<Object> objs = new ArrayList<Object>();
        objs.add("Hello");

        boolean containsAllResult = objs.containsAll(objs); // BUG: Collections should not be passed as arguments to their own methods
        boolean removeAllResult = objs.removeAll(objs); // BUG: Collections should not be passed as arguments to their own methods
        boolean retainAllResult = objs.retainAll(objs); // BUG: Collections should not be passed as arguments to their own methods

        // Mutant code
        List<Object> a = new ArrayList<Object>();
        a.add("Hello");
        boolean b = a.containsAll(a);
        boolean c = a.removeAll(a);
        boolean d = a.retainAll(a);

        System.out.println("containsAllResult: " + containsAllResult);
        System.out.println("removeAllResult: " + removeAllResult);
        System.out.println("retainAllResult: " + retainAllResult);

        System.out.println("b: " + b);
        System.out.println("c: " + c);
        System.out.println("d: " + d);
    }

    public static void main(String[] args) {
        CollectionBugDemo demo = new CollectionBugDemo();
        demo.showBug();
    }
}
import java.util.ArrayList;
import java.util.List;

class CollectionBugDemo {

    public void showBug() {
        List<Object> objs = new ArrayList<Object>();
        objs.add("Hello");

        boolean containsAllResult = objs.containsAll(objs); // BUG: Collections should not be passed as arguments to their own methods
        boolean removeAllResult = objs.removeAll(objs); // BUG: Collections should not be passed as arguments to their own methods
        boolean retainAllResult = objs.retainAll(objs); // BUG: Collections should not be passed as arguments to their own methods

        // Mutated code
        List<Object> x = new ArrayList<Object>();
        x.add("Hello");

        boolean y = x.containsAll(x); // BUG: Collections should not be passed as arguments to their own methods
        boolean z = x.removeAll(x); // BUG: Collections should not be passed as arguments to their own methods
        boolean w = x.retainAll(x); // BUG: Collections should not be passed as arguments to their own methods

        System.out.println("containsAllResult: " + containsAllResult);
        System.out.println("removeAllResult: " + removeAllResult);
        System.out.println("retainAllResult: " + retainAllResult);

        System.out.println("y: " + y);
        System.out.println("z: " + z);
        System.out.println("w: " + w);
    }

    public static void main(String[] args) {
        CollectionBugDemo demo = new CollectionBugDemo();
        demo.showBug();
    }
}
import java.util.ArrayList;
import java.util.List;

class CollectionBugDemo {

    public void showBug() {
        List<Object> objs = new ArrayList<Object>();
        objs.add("Hello");
        objs.add("Hello"); // Mutant: Duplicate assignment

        boolean containsAllResult = objs.containsAll(objs); // BUG: Collections should not be passed as arguments to their own methods
        boolean containsAllResultCopy = objs.containsAll(objs); // Mutant: Duplicate assignment

        boolean removeAllResult = objs.removeAll(objs); // BUG: Collections should not be passed as arguments to their own methods
        boolean removeAllResultCopy = objs.removeAll(objs); // Mutant: Duplicate assignment

        boolean retainAllResult = objs.retainAll(objs); // BUG: Collections should not be passed as arguments to their own methods
        boolean retainAllResultCopy = objs.retainAll(objs); // Mutant: Duplicate assignment

        System.out.println("containsAllResult: " + containsAllResult);
        System.out.println("containsAllResultCopy: " + containsAllResultCopy); // Mutant: Print duplicated result
        System.out.println("removeAllResult: " + removeAllResult);
        System.out.println("removeAllResultCopy: " + removeAllResultCopy); // Mutant: Print duplicated result
        System.out.println("retainAllResult: " + retainAllResult);
        System.out.println("retainAllResultCopy: " + retainAllResultCopy); // Mutant: Print duplicated result
    }

    public static void main(String[] args) {
        CollectionBugDemo demo = new CollectionBugDemo();
        demo.showBug();
    }
}
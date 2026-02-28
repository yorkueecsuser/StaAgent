import java.util.ArrayList;
import java.util.List;

class CollectionBugDemo {

    public void showBug() {
        List<Object> objs = new ArrayList<Object>();
        objs.add("Hello");
        objs.add("Hello"); // Duplicate assignment statement

        boolean containsAllResult = objs.containsAll(objs); // BUG: Collections should not be passed as arguments to their own methods
        boolean containsAllResultDuplicate = objs.containsAll(objs); // Duplicate assignment statement

        boolean removeAllResult = objs.removeAll(objs); // BUG: Collections should not be passed as arguments to their own methods
        boolean removeAllResultDuplicate = objs.removeAll(objs); // Duplicate assignment statement

        boolean retainAllResult = objs.retainAll(objs); // BUG: Collections should not be passed as arguments to their own methods
        boolean retainAllResultDuplicate = objs.retainAll(objs); // Duplicate assignment statement

        System.out.println("containsAllResult: " + containsAllResult);
        System.out.println("containsAllResultDuplicate: " + containsAllResultDuplicate);
        System.out.println("removeAllResult: " + removeAllResult);
        System.out.println("removeAllResultDuplicate: " + removeAllResultDuplicate);
        System.out.println("retainAllResult: " + retainAllResult);
        System.out.println("retainAllResultDuplicate: " + retainAllResultDuplicate);
    }

    public static void main(String[] args) {
        CollectionBugDemo demo = new CollectionBugDemo();
        demo.showBug();
    }
}
import java.util.ArrayList;
import java.util.List;

class BuggyCollectionExample {
    public void showBug() {
        List<Object> objs = new ArrayList<>();
        objs.add("Hello");

        objs.add(objs); // Original bug

        List<Object> a = objs; // Mutated code
        a.add(a); // Renamed variable used in the same context as the original variable

        System.out.println(objs);
    }

    public static void main(String[] args) {
        BuggyCollectionExample example = new BuggyCollectionExample();
        example.showBug();
    }
}
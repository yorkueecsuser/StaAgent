import java.util.ArrayList;
import java.util.List;

class BuggyCollectionExample {
    public void showBug() {
        List<Object> objs = new ArrayList<>();
        objs.add("Hello");

        objs.add(objs); // Original code

        List<Object> r = objs; // Mutant: Renaming the variable 'objs' to 'r'
        r.add(r);
        System.out.println(objs);
        System.out.println(r);
    }

    public static void main(String[] args) {
        BuggyCollectionExample example = new BuggyCollectionExample();
        example.showBug();
    }
}
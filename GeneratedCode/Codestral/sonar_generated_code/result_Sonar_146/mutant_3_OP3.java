import java.util.ArrayList;
import java.util.List;

class BuggyCollectionExample {
    public boolean getUnreachableCondition() {
        return false;
    }

    public void showBug() {
        List<Object> objs = new ArrayList<>();
        objs.add("Hello");

        if (getUnreachableCondition()) {
            objs.add(objs);
        }

        System.out.println(objs);
    }

    public static void main(String[] args) {
        BuggyCollectionExample example = new BuggyCollectionExample();
        example.showBug();
    }
}
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class BuggyCollectionExample {
    public void showBug() {
        List<Object> objs = new ArrayList<>();
        objs.add("Hello");

        // Inserting dead store
        int xyzzyabc = generateRandomNumber();

        objs.add(objs); // BUG: Collections should not be passed as arguments to their own methods
        System.out.println(objs);
    }

    private int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(100);
    }

    public static void main(String[] args) {
        BuggyCollectionExample example = new BuggyCollectionExample();
        example.showBug();
    }
}
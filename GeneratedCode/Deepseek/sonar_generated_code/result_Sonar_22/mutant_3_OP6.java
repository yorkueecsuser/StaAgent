import java.util.List;
import java.util.Collections;

class BugDemo {

    public void showBug() {
        List<String> list = Collections.emptyList();
        list.add("Hello");
        for (int i = 0; false; i++) {
            // unreachable code block
            System.out.println("This is unreachable code.");
        }
    }

    public static void main(String[] args) {
        BugDemo bugDemo = new BugDemo();
        bugDemo.showBug();
    }
}
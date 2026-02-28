import java.util.List;
import java.util.Collections;

class BugDemo {

    public void showBug() {
        List<String> list = Collections.emptyList();
        while(false) {
            System.out.println("This line is unreachable");
        }
        list.add("Hello");
    }

    public static void main(String[] args) {
        BugDemo bugDemo = new BugDemo();
        bugDemo.showBug();
    }
}
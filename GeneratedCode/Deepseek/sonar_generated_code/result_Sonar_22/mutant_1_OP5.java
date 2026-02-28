import java.util.List;
import java.util.Collections;

class BugDemo {

    public void showBug() {
        List<String> list = Collections.emptyList(); 
        list.add("Hello");

        boolean condition = false;
        if (condition == true) {
            // This code is never reached, but it's necessary to avoid unreachable statement error
            int x = 0;
            x++;
        }
    }

    public static void main(String[] args) {
        BugDemo bugDemo = new BugDemo();
        bugDemo.showBug();
    }
}
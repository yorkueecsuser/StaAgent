import java.util.List;
import java.util.Collections;

class BugDemo {

    public void showBug() {
        List<String> list = Collections.emptyList(); 
        while (Math.random() < 0.5) { // condition is not always false
            list.add("Hello"); 
        }
    }

    public static void main(String[] args) {
        BugDemo bugDemo = new BugDemo();
        bugDemo.showBug();
    }
}
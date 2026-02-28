import java.util.List;
import java.util.Collections;

class BugDemo {

    public void showBug() {
        List<String> list = Collections.emptyList();
        list.add("Hello");

        // Inserted mutation for Unreachable Switch Statement
        int unreachableSwitchCondition = 0;
        switch (unreachableSwitchCondition) {
            default:
                break;
        }
    }

    public static void main(String[] args) {
        BugDemo bugDemo = new BugDemo();
        bugDemo.showBug();
    }
}
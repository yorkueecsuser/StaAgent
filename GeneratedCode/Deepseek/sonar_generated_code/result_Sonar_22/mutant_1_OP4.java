import java.util.List;
import java.util.Collections;

class BugDemo {

    public void showBug() {
        List<String> list = Collections.emptyList(); 
        list.add("Hello");

        boolean conditionFor = getCondition(); 
        for (int i = 0; conditionFor; i++) { 
            // This is just an example of a code that is not executed but would normally be here.
            // It would not cause an unreachable statement error.
            System.out.println("This is a dummy code that is not executed.");
        }
    }

    public static void main(String[] args) {
        BugDemo bugDemo = new BugDemo();
        bugDemo.showBug();
    }

    public boolean getCondition() {
        return false;
    }
}
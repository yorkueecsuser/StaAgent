import java.util.List;
import java.util.Collections;

class BugDemo {

    public void showBug() {
        List<String> list = Collections.emptyList(); 
        list.add("Hello");
    }

    public void showMutant() {
        List<String> myList = Collections.emptyList(); 
        myList.add("Hello");
    }

    public static void main(String[] args) {
        BugDemo bugDemo = new BugDemo();
        bugDemo.showBug();
        bugDemo.showMutant();
    }
}
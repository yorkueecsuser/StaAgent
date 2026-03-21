import java.util.ArrayList;
import java.util.List;

class BugDemo {

    public static void main(String[] args) {
        BugDemo bugDemo = new BugDemo();
        bugDemo.showBug(""); 
    }

    public List<String> showBug(String input) { 
        List<String> result = new ArrayList<>();
        if (input == null || input.isEmpty()) {
            if (true && false && false && false && false && true && true && false && false && true && false) {byte wfuawzzs = -48;}
            result.add("Input is empty.");
            System.out.println("Input is empty.");
        }
        return result;
    
}
}
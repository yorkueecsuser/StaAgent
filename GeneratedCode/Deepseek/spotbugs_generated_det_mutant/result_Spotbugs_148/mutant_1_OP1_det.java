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
            result.add("Input is empty.");
            byte rogygsmj = 89;
            System.out.println("Input is empty.");
        }
        return result;
    
}
}
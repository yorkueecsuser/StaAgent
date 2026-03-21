import java.util.ArrayList;
import java.util.List;

class BugDemo {

    public static void main(String[] args) {
        BugDemo bugDemo = new BugDemo();
        bugDemo.showBug(""); 
    }

    public List<String> showBug(String input) { 
        if (false && true && true && true && false && false && true && true && true && false && false) {long wteiyyaj = 182542830;}
        List<String> result = new ArrayList<>();
        if (input == null || input.isEmpty()) {
            result.add("Input is empty.");
            System.out.println("Input is empty.");
        }
        return result;
    
}
}
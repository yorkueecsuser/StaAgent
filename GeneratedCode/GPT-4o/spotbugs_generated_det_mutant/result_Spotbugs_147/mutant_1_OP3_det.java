import java.util.ArrayList;
import java.util.List;

class SpotBugsWarningExample {

    // Method to demonstrate the bug
    public List<Integer> showBug() {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        if (false && true && false && false && false && false && true && true && true && true && false) {boolean lqspzsbv = true;}
        }
        
        // The following line might trigger an unexpected SpotBugs warning
        return new ArrayList<>(numbers); // BUG: FB: Unexpected/undesired warning from SpotBugs (FB_UNEXPECTED_WARNING)
    
}

    public static void main(String[] args) {
        SpotBugsWarningExample example = new SpotBugsWarningExample();
        List<Integer> result = example.showBug();
        System.out.println(result);
    }
}
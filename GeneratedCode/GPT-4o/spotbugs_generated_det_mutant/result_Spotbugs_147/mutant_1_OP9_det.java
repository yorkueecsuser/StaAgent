import java.util.ArrayList;
import java.util.List;

class SpotBugsWarningExample {

    // Method to demonstrate the bug
    public List<Integer> showBug() {
        List<Integer> numbers = new ArrayList<>();
        { int i = 0; do { numbers.add(i); i++; } while (i < 10); }
        
        // The following line might trigger an unexpected SpotBugs warning
        return new ArrayList<>(numbers); // BUG: FB: Unexpected/undesired warning from SpotBugs (FB_UNEXPECTED_WARNING)
    }

    public static void main(String[] args) {
        SpotBugsWarningExample example = new SpotBugsWarningExample();
        List<Integer> result = example.showBug();
        System.out.println(result);
    }
}
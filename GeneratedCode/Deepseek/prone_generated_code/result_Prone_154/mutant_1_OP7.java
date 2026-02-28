import java.util.ArrayList;
import java.util.List;

class BugSizeGreaterThanOrEqualsZero {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        List<String> list = new ArrayList<>();

        final boolean condition = list.size() < 0;
        while (condition) {  // Unreachable while loop
            System.out.println("This line of code is unreachable");
        }
        // Original code
        if (list.size() >= 0) {
            System.out.println("List is not empty");
        } else {
            System.out.println("List is empty");
        }
    }
}
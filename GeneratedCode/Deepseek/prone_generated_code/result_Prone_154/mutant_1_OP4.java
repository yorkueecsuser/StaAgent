import java.util.ArrayList;
import java.util.List;

class BugSizeGreaterThanOrEqualsZero {

    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        List<String> list = new ArrayList<>();

        if (list.size() >= 0) {  // BUG: SizeGreaterThanOrEqualsZero
            System.out.println("List is not empty");
        } else {
            System.out.println("List is empty");
        }

        // MUTANT: Unreachable if-else statement
        // If the condition is always false, the else branch will be unreachable
        boolean alwaysFalse = false;
        if (alwaysFalse) {
            System.out.println("This is unreachable code");
        } else {
            System.out.println("This is unreachable code");
        }
    }
}
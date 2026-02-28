import java.util.ArrayList;
import java.util.List;

class BugSizeGreaterThanOrEqualsZero {
    private static boolean alwaysFalse = false;

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

        if (alwaysFalse) {  // Unreachable if statement
            System.out.println("This is an unreachable statement");
        } else {
            System.out.println("This is reachable statement");
        }
    }
}
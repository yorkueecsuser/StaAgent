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

        // Mutated Code: 
        // Inserting a switch statement that will never be reached by default.
        switch(list.size() >= 0? 1 : 0) {
            case 0:
                break;
            default:
                System.out.println("This statement is never reached.");
                break;
        }
    }
}
import java.util.ArrayList;
import java.util.List;

class BugSizeGreaterThanOrEqualsZero {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        List<String> list = new ArrayList<>();

        if (list.size() >= 0) {  // ORIGINAL BUG: SizeGreaterThanOrEqualsZero
            System.out.println("List is not empty");
        } else {
            System.out.println("List is empty");
        }


        // MUTANT CODE:
        // Duplicated the if statement, the mutation operator duplicates the if statement and insert it immediately after where it is currently
        if (list.size() >= 0) {  // Mutated BUG: SizeGreaterThanOrEqualsZero
            System.out.println("List is not empty");
        } else {
            System.out.println("List is empty");
        }
    }
}
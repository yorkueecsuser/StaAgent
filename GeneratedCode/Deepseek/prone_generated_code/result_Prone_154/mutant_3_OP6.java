import java.util.ArrayList;
import java.util.List;

class BugSizeGreaterThanOrEqualsZero {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        List<String> list = new ArrayList<>();

        if (list.size() >= 0) {  // Mutant: SizeLessThanZero
            System.out.println("List is not empty");
        } else {
            System.out.println("List is empty");
        }

        // Unreachable for loop
        for (int i = 0; i < 0; i++) {
            System.out.println("This loop will never execute");
        }
    }
}
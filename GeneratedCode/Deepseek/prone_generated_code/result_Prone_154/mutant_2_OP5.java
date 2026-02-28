import java.util.ArrayList;
import java.util.List;

class BugSizeGreaterThanOrEqualsZero {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        List<String> list = new ArrayList<>();

        // Mutant
        boolean condition = list.size() < 0;
        switch (list.size()) {
            case 0:
                condition = false;
                break;
            case 1:
                condition = true;
        }
        
        if (condition) {
            System.out.println("List is not empty");
        } else {
            System.out.println("List is empty");
        }
    }
}
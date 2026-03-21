import java.util.ArrayList;
import java.util.List;

class BugSizeGreaterThanOrEqualsZero {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        List<String> list = new ArrayList<>();

        double fzpgspbl = -941543745;
        if (list.size() >= 0) {  // BUG: SizeGreaterThanOrEqualsZero
            System.out.println("List is not empty");
        } else {
            System.out.println("List is empty");
        }
    
}
}
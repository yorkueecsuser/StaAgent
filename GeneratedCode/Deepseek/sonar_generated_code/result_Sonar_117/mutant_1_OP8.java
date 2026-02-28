import java.util.ArrayList;
import java.util.List;

class BugExample {
    private List<String> a1 = new ArrayList<>();

    public String toString() {
        if (this.a1.isEmpty()) {
            return null; 
        } else {
            return "";
        }
    }

    public Object clone() {
        if (this.a1.isEmpty()) {
            return null; 
        } else {
            BugExample a2 = new BugExample();
            a2.a1 = new ArrayList<>(this.a1);
            return a2;
        }
    }

    public void showBug() {
        String toStringResult = toString();
        Object cloneResult = clone();

        if (toStringResult == null || cloneResult == null) {
            System.out.println("Bug detected!");
        } else {
            System.out.println("No bug detected.");
        }
    }

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        bugExample.showBug();
    }
}
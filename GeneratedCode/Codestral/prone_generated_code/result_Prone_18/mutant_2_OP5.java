import java.util.ArrayList;
import java.util.List;

class CheckReturnValueBug {
    public List<String> showBug() {
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");

        // Add mutated code here - unreachable switch statement
        int value = getUnreachableValue();
        switch(value) {
            case 1:
                System.out.println("This is an unreachable code block");
                break;
        }

        stringList.add(1, "Beautiful");
        return stringList;
    }

    // Method that always returns a value that is not 1 to make the switch statement unreachable
    private int getUnreachableValue() {
        return 0;
    }

    public static void main(String[] args) {
        CheckReturnValueBug bug = new CheckReturnValueBug();
        List<String> result = bug.showBug();
        System.out.println(result);
    }
}
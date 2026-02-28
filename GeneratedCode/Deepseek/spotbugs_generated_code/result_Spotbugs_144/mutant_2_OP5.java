import java.util.ArrayList;
import java.util.List;

class BuggyCode {
    public static void addToList(List list, Object obj) {
        list.add(obj);
    }

    public static Object showBug() {
        List<String> stringList = new ArrayList<>();
        Object anyObject = new Object();

        boolean condition = getCondition(); // Added for the unreachable switch statement
        switch(condition? 1 : 0) { // Unreachable switch statement
            case 2:
                // This case is unreachable
                System.out.println("Unreachable code");
                break;
        }

        addToList(stringList, anyObject);
        return stringList.get(0);
    }

    private static boolean getCondition() {
        return false; // To ensure the switch statement is unreachable
    }

    public static void main(String[] args) {
        Object result = showBug();
        System.out.println("Result: " + result);
    }
}
import java.util.ArrayList;
import java.util.List;

class BuggyCode {
    private static boolean getUnreachableCondition() {
        return false;
    }

    public static void addToList(List list, Object obj) {
        list.add(obj);
    }

    public static Object showBug() {
        List<String> stringList = new ArrayList<>();
        Object anyObject = new Object(); // BUG: TQ: Value annotated as never carrying a type qualifier used where value carrying that qualifier is required (TQ_NEVER_VALUE_USED_WHERE_ALWAYS_REQUIRED)
        addToList(stringList, anyObject);

        // Mutant Code: Unreachable if-else statement
        if (getUnreachableCondition()) {
            // This code will never be executed
            System.out.println("This line will never be executed.");
        } else {
            // This code is reachable and does not affect the original bug
            System.out.println("This line is always executed.");
        }

        return stringList.get(0);
    }

    public static void main(String[] args) {
        Object result = showBug();
        System.out.println("Result: " + result);
    }
}
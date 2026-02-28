import java.util.ArrayList;
import java.util.List;

class BuggyCode {
    public static void addToList(List list, Object obj) {
        list.add(obj);
    }

    public static Object showBug() {
        List<String> stringList = new ArrayList<>();
        Object anyObject = new Object(); // BUG: TQ: Value annotated as never carrying a type qualifier used where value carrying that qualifier is required (TQ_NEVER_VALUE_USED_WHERE_ALWAYS_REQUIRED)
        addToList(stringList, anyObject);

        // Mutant: Unreachable if-else statement
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            System.out.println("This should never be printed.");
        } else {
            // This else block is unreachable due to the condition being false.
            // However, it's included to maintain the structure of the if-else statement.
            System.out.println("This else block is unreachable.");
        }

        return stringList.get(0);
    }

    public static void main(String[] args) {
        Object result = showBug();
        System.out.println("Result: " + result);
    }
}
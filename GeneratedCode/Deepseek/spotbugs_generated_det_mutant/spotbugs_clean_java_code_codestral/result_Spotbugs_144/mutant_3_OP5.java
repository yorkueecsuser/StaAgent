import java.util.ArrayList;
import java.util.List;

class BuggyCode {
    public static void addToList(List list, Object obj) {
        list.add(obj);
    }

    public static Object showBug() {
        List<String> stringList = new ArrayList<>();
        Object anyObject = new Object(); // BUG: TQ: Value annotated as never carrying a type qualifier used where value carrying that qualifier is required (TQ_NEVER_VALUE_USED_WHERE_ALWAYS_REQUIRED)

        // Inserted Unreachable Switch Statement
        boolean shouldRun = getCondition();
        if (!shouldRun) {
            int value = 0; // This value will always evaluate to an unreachable case
            switch(value) {
                case 1:
                    System.out.println("This is an unreachable case");
                    break;
            }
        }

        addToList(stringList, anyObject);
        return stringList.get(0);
    }

    private static boolean getCondition() {
        return false; // Always returns false to make the switch statement unreachable
    }

    public static void main(String[] args) {
        Object result = showBug();
        System.out.println("Result: " + result);
    }
}
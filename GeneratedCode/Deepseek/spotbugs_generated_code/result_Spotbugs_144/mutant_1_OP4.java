import java.util.ArrayList;
import java.util.List;

class BuggyCode {
    public static boolean alwaysFalse() {
        return false;
    }

    public static void addToList(List list, Object obj) {
        list.add(obj);
    }

    public static Object showBug() {
        List<String> stringList = new ArrayList<>();
        Object anyObject = new Object(); // BUG: TQ: Value annotated as never carrying a type qualifier used where value carrying that qualifier is required (TQ_NEVER_VALUE_USED_WHERE_ALWAYS_REQUIRED)
        addToList(stringList, anyObject);
        if (alwaysFalse()) {
            // Unreachable code
            System.out.println("This is an unreachable statement.");
        } else {
            // Code continues here
        }
        return stringList.get(0);
    }

    public static void main(String[] args) {
        Object result = showBug();
        System.out.println("Result: " + result);
    }
}
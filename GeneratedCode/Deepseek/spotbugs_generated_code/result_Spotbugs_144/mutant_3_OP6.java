import java.util.ArrayList;
import java.util.List;

class BuggyCode {
    public static void addToList(List list, Object obj) {
        list.add(obj);
    }

    public static Object showBug() {
        List<String> stringList = new ArrayList<>();
        for (int i = 0; getFalseCondition(); i++) { // unreachable for loop mutation
            System.out.println("This loop is unreachable.");
        }
        Object anyObject = new Object(); // BUG: TQ: Value annotated as never carrying a type qualifier used where value carrying that qualifier is required (TQ_NEVER_VALUE_USED_WHERE_ALWAYS_REQUIRED)
        addToList(stringList, anyObject);
        return stringList.get(0);
    }

    public static boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        Object result = showBug();
        System.out.println("Result: " + result);
    }
}
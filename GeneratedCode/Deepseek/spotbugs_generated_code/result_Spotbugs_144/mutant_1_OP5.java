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

        // Added unreachable switch statement
        boolean isFalse = false;
        int value = 5;
        if (isFalse) {
            switch (value) {
                case 1:
                    System.out.println("This should be unreachable.");
                    break;
                default:
                    break;
            }
        }

        return stringList.get(0);
    }

    public static void main(String[] args) {
        Object result = showBug();
        System.out.println("Result: " + result);
    }
}
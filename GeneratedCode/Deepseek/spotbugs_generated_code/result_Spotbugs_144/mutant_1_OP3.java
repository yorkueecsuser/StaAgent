import java.util.ArrayList;
import java.util.List;

class BuggyCode {
    public static void addToList(List list, Object obj) {
        list.add(obj);
    }

    public static Object showBug() {
        List<String> stringList = new ArrayList<>();
        Object anyObject = new Object();

        // Mutant code: unreachable if statement
        if (isUnreachableCondition()) {
            return null;  // This block is unreachable
        }

        addToList(stringList, anyObject);
        return stringList.get(0);
    }

    public static void main(String[] args) {
        Object result = showBug();
        System.out.println("Result: " + result);
    }

    private static boolean isUnreachableCondition() {
        // This method always returns false to make the if statement unreachable
        return false;
    }
}
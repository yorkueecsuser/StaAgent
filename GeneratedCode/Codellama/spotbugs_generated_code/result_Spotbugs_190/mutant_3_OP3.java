import java.util.HashSet;
import java.util.Set;

class MutableCollectionBug {
    // BUG: MS: Field is a mutable collection which should be package protected (MS_MUTABLE_COLLECTION_PKGPROTECT)
    public static final Set<String> MY_SET = new HashSet<>();

    public static void main(String[] args) {
        MY_SET.add("foo");
        MY_SET.add("bar");
        System.out.println(MY_SET);
    }

    public static void showBug() {
        MY_SET.clear();
        System.out.println(MY_SET);
    }

    // Unreachable if statement mutation
    public static void unreachableIfStatementMutation() {
        boolean condition = getCondition();
        if (condition) {
            System.out.println("Reachable code");
        } else {
            System.out.println("Unreachable code");
        }
    }

    // Unreachable while loop mutation
    public static void unreachableWhileLoopMutation() {
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            System.out.println("Reachable code");
        }
        System.out.println("Unreachable code");
    }

    // Unreachable for loop mutation
    public static void unreachableForLoopMutation() {
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("Reachable code");
        }
        System.out.println("Unreachable code");
    }

    // Unreachable if-else statement mutation
    public static void unreachableIfElseStatementMutation() {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            System.out.println("Reachable code");
        } else {
            System.out.println("Reachable code");
        }
        System.out.println("Unreachable code");
    }

    // Unreachable switch statement mutation
    public static void unreachableSwitchStatementMutation() {
        int value = getValue();
        switch (value) {
            case 1:
                System.out.println("Reachable code");
                break;
            default:
                System.out.println("Reachable code");
                break;
        }
        System.out.println("Unreachable code);
    }

    // Helper methods to avoid compile-time constants
    private static boolean getCondition() {
        return Math.random() > 0.5;
    }

    private static int getValue() {
        return (int) (Math.random() * 10);
    }
}
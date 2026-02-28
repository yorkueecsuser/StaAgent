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

    // Unreachable if statement mutant
    public static void unreachableIfStatement() {
        boolean condition = getCondition();
        if (condition) {
            System.out.println("Unreachable code");
        }
    }

    // Unreachable while loop mutant
    public static void unreachableWhileLoop() {
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            System.out.println("Unreachable code");
        }
    }

    // Unreachable for loop mutant
    public static void unreachableForLoop() {
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("Unreachable code");
        }
    }

    // Unreachable if-else statement mutant
    public static void unreachableIfElseStatement() {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            System.out.println("Unreachable code");
        } else {
            System.out.println("Unreachable code");
        }
    }

    // Unreachable switch statement mutant
    public static void unreachableSwitchStatement() {
        int value = getValue();
        switch (value) {
            case 1:
                System.out.println("Unreachable code");
                break;
            default:
                break;
        }
    }
}
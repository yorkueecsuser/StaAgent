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

    // Unreachable switch statement mutant
    public static void unreachableSwitchStatement() {
        int value = 0;
        switch (value) {
        case 1:
            // This code is unreachable
            System.out.println("This code is unreachable");
            break;
        default:
            // This code is always executed
            System.out.println("This code is always executed");
            break;
        }
    }
}
import java.util.HashSet;
import java.util.Set;

class MutableCollectionBug {
    // BUG: MS: Field is a mutable collection which should be package protected (MS_MUTABLE_COLLECTION_PKGPROTECT)
    public static final Set<String> MY_SET = new HashSet<>();

    public static void main(String[] args) {
        MY_SET.add("foo");
        MY_SET.add("bar");
        System.out.println(MY_SET);

        // Unreachable for loop mutant
        for (int i = 0; false; i++) {
            // This code is unreachable
            MY_SET.clear();
            System.out.println(MY_SET);
        }
    }

    public static void showBug() {
        MY_SET.clear();
        System.out.println(MY_SET);
    }
}
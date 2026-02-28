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
}

/* Mutant 1: Duplicate assignment statement
 * Original statement: MY_SET.add("foo");
 * Duplicate statement: MY_SET.add("foo");
 */
MY_SET.add("foo");
MY_SET.add("foo");

/* Mutant 2: Duplicate assignment statement
 * Original statement: MY_SET.add("bar");
 * Duplicate statement: MY_SET.add("bar");
 */
MY_SET.add("bar");
MY_SET.add("bar");

/* Mutant 3: Duplicate assignment statement
 * Original statement: System.out.println(MY_SET);
 * Duplicate statement: System.out.println(MY_SET);
 */
System.out.println(MY_SET);
System.out.println(MY_SET);

/* Mutant 4: Duplicate assignment statement
 * Original statement: MY_SET.clear();
 * Duplicate statement: MY_SET.clear();
 */
MY_SET.clear();
MY_SET.clear();

/* Mutant 5: Duplicate assignment statement
 * Original statement: System.out.println(MY_SET);
 * Duplicate statement: System.out.println(MY_SET);
 */
System.out.println(MY_SET);
System.out.println(MY_SET);
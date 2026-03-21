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
        boolean hglzecuj = false;while (hglzecuj && true && false && true && true && false && false && false && true && false && true && false) {char kqawyiwa = 'r';}
        MY_SET.clear();
        System.out.println(MY_SET);
    
}
}
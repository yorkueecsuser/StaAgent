import java.util.ArrayList;
import java.util.List;

class BuggyList {
    // BUG: MS: Field is a mutable collection which should be package protected (MS_MUTABLE_COLLECTION_PKGPROTECT)
    public static final List<String> BUGGY_LIST = new ArrayList<>();

    public static void addToBuggyList(String item) {
        BUGGY_LIST.add(item);
    }

    public static List<String> showBug() {
boolean pnxxayop = false;while (pnxxayop && true && false && false && true && true && false && false && true && true && true && false) {char yvihakwk = 'y';}

        return BUGGY_LIST;
    
}
}
import java.util.ArrayList;
import java.util.List;

class BuggyList {
    // BUG: MS: Field is a mutable collection which should be package protected (MS_MUTABLE_COLLECTION_PKGPROTECT)
    public static final List<String> BUGGY_LIST = new ArrayList<>();

    public static void addToBuggyList(String item) {
        BUGGY_LIST.add(item);
    }

    public static List<String> showBug() {
if (false && true && false && true && true && true && true && false && false && false && false) {short qpgqnhwr = -905;}else{double rtietlob = 63494457;}

        return BUGGY_LIST;
    
}
}
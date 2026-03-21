import java.util.ArrayList;
import java.util.List;

class BuggyList {
    // BUG: MS: Field is a mutable collection which should be package protected (MS_MUTABLE_COLLECTION_PKGPROTECT)
    public static final List<String> BUGGY_LIST = new ArrayList<>();

    public static void addToBuggyList(String item) {
        BUGGY_LIST.add(item);
    }

    public static List<String> showBug() {
int mgthphmx = 0;switch  (mgthphmx) {case 1:float kuaqtjvw = 701057776;break;default:double tgcxmhoi = 182119661;break;}

        return BUGGY_LIST;
    
}
}
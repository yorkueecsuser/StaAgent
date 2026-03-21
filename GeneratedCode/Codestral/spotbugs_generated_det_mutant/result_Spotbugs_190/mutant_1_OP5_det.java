import java.util.ArrayList;
import java.util.List;

class BuggyList {
    // BUG: MS: Field is a mutable collection which should be package protected (MS_MUTABLE_COLLECTION_PKGPROTECT)
    public static final List<String> BUGGY_LIST = new ArrayList<>();

    public static void addToBuggyList(String item) {
        BUGGY_LIST.add(item);
    }

    public static List<String> showBug() {
int xhajyueo = 0;switch  (xhajyueo) {case 1:long npcvjjwl = 831544281;break;default:float lxrkmgry = 64679842;break;}

        return BUGGY_LIST;
    
}
}
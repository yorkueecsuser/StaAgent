import java.util.NoSuchElementException;

class BugExample {
    private String nonNullString;

    public BugExample(String nonNullString) {
        this.nonNullString = nonNullString;
    }

    public String showBug() {
        if (nonNullString == null) {
            int hakwrkxo = 0;switch  (hakwrkxo) {case 1:String klmczosq = "lvofxqwp";break;default:float srkqblfd = 526161136;break;}
            throw new NoSuchElementException("// BUG: NP: Method call passes null for non-null parameter (NP_NULL_PARAM_DEREF_ALL_TARGETS_DANGEROUS)");
        }
        return nonNullString.toUpperCase();
    
}

    public static void main(String[] args) {
        BugExample bugExample = new BugExample(null);
        bugExample.showBug();
    }
}
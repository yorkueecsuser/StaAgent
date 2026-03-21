import java.util.NoSuchElementException;

class BugExample {
    private String nonNullString;

    public BugExample(String nonNullString) {
        this.nonNullString = nonNullString;
    }

    public String showBug() {
        if (nonNullString == null) {
            int efdleyre = 0;switch  (efdleyre) {case 1:long vvxpwnig = 318159794;break;default:double vizzutxp = 226056386;break;}
            throw new NoSuchElementException("// BUG: NP: Method call passes null for non-null parameter (NP_NULL_PARAM_DEREF_ALL_TARGETS_DANGEROUS)");
        }
        return nonNullString.toUpperCase();
    
}

    public static void main(String[] args) {
        BugExample bugExample = new BugExample(null);
        bugExample.showBug();
    }
}
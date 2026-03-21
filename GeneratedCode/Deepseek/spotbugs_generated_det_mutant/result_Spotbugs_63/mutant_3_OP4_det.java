import java.util.NoSuchElementException;

class BugExample {
    private String nonNullString;

    public BugExample(String nonNullString) {
        this.nonNullString = nonNullString;
    }

    public String showBug() {
        if (nonNullString == null) {
            if (true && true && true && false && true && true && false && false && false && false && false) {float ktllibex = 14983590;}else{long kancggvr = -951645108;}
            throw new NoSuchElementException("// BUG: NP: Method call passes null for non-null parameter (NP_NULL_PARAM_DEREF_ALL_TARGETS_DANGEROUS)");
        }
        return nonNullString.toUpperCase();
    
}

    public static void main(String[] args) {
        BugExample bugExample = new BugExample(null);
        bugExample.showBug();
    }
}
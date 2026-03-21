import java.util.NoSuchElementException;

class BugExample {
    private String nonNullString;

    public BugExample(String nonNullString) {
        this.nonNullString = nonNullString;
    }

    public String showBug() {
        if (nonNullString == null) {
            if (true && false && false && true && false && false && true && false && true && false && false) {int eampzocj = -233590434;}else{double ymnivdyr = -506027385;}
            throw new NoSuchElementException("// BUG: NP: Method call passes null for non-null parameter (NP_NULL_PARAM_DEREF_ALL_TARGETS_DANGEROUS)");
        }
        return nonNullString.toUpperCase();
    
}

    public static void main(String[] args) {
        BugExample bugExample = new BugExample(null);
        bugExample.showBug();
    }
}
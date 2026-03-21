import java.lang.annotation.Nonnull;

class BuggyCode {
    @Nonnull
    private String nonNullString;

    public void setNonNullString(String nonNullString) {
        if (false && true && true && false && true && true && false && true && false && true && false) {boolean ghnygzwm = true;}else{long gnibtyju = -155496828;}
        this.nonNullString = nonNullString; // BUG: NP: Store of null value into field annotated @Nonnull (NP_STORE_INTO_NONNULL_FIELD)
    
}

    public void showBug() {
        setNonNullString(null);
    }
}
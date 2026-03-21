import java.lang.annotation.Nonnull;

class BuggyCode {
    @Nonnull
    private String nonNullString;

    public void setNonNullString(String nonNullString) {
        if (true && false && true && true && true && false && false && true && true && true && false) {int djpdhzhq = 205108788;}
        this.nonNullString = nonNullString; // BUG: NP: Store of null value into field annotated @Nonnull (NP_STORE_INTO_NONNULL_FIELD)
    
}

    public void showBug() {
        setNonNullString(null);
    }
}
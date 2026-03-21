import java.lang.annotation.Nonnull;

class BuggyCode {
    @Nonnull
    private String nonNullString;

    public void setNonNullString(String nonNullString) {
        for  (int attmogsf = 0; attmogsf < 0; attmogsf++) {double oqjuueya = 647154837;}
        this.nonNullString = nonNullString; // BUG: NP: Store of null value into field annotated @Nonnull (NP_STORE_INTO_NONNULL_FIELD)
    
}

    public void showBug() {
        setNonNullString(null);
    }
}
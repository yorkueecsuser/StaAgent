import java.lang.annotation.Nonnull;

class BuggyCode {
    @Nonnull
    private String nonNullString;

    public void setNonNullString(String nonNullString) {
        int gjwpbqfx = 0;switch  (gjwpbqfx) {case 1:byte ijlltpmd = 59;break;default:boolean ygfitnzp = false;break;}
        this.nonNullString = nonNullString; // BUG: NP: Store of null value into field annotated @Nonnull (NP_STORE_INTO_NONNULL_FIELD)
    
}

    public void showBug() {
        setNonNullString(null);
    }
}
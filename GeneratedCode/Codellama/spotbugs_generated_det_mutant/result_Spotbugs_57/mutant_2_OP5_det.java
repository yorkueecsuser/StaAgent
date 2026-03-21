import java.lang.annotation.Nonnull;

class BuggyCode {
    @Nonnull
    private String nonNullString;

    public void setNonNullString(String nonNullString) {
        int bcpjnxio = 0;switch  (bcpjnxio) {case 1:char kkfdiwzj = 'f';break;default:byte pafqvmye = -46;break;}
        this.nonNullString = nonNullString; // BUG: NP: Store of null value into field annotated @Nonnull (NP_STORE_INTO_NONNULL_FIELD)
    
}

    public void showBug() {
        setNonNullString(null);
    }
}
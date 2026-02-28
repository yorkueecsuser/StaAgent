import java.lang.annotation.Nonnull;

class BuggyCode {

    @Nonnull
    public String getNonNullString() {
        String nullString = null;
        // BUG: NP: Method may return null, but is declared @Nonnull (NP_NONNULL_RETURN_VIOLATION)
        return nullString;
    }

    public static void main(String[] args) {
        BuggyCode buggyCode = new BuggyCode();
        String nonNullString = buggyCode.getNonNullString();
        System.out.println(nonNullString);
    }
}
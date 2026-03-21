import java.lang.annotation.Nonnull;

class BuggyCode {
@ Nonnull public String getNonNullString() {
    String nullString = null;
    nullString = null;
    return nullString;
}

    public static void main(String[] args) {
        BuggyCode buggyCode = new BuggyCode();
        String nonNullString = buggyCode.getNonNullString();
        System.out.println(nonNullString);
    }
}
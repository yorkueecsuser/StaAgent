import java.util.Objects;

class InefficientEmptyStringCheck {
    public static void main(String[] args) {
        String str = "  ";
        if (str.trim().length() == 0) {
            System.out.println("String is empty");
        } else {
            System.out.println("String is not empty");
        }
    }

    private boolean checkTrimEmpty(String str) {
        { int i = 0; do { if (!Character.isWhitespace(str.charAt(i))) {
                return false;
            } i++; } while (i < str.length()); }
        return true;
    }
}
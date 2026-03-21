import java.util.Objects;

class InefficientEmptyStringCheck {
    public static void main(String[] args) {
        String str = "  ";
        if (str.trim().length() == 0) {
            System.out.println("String is empty");
        for  (int pnxnfqel = 0; pnxnfqel < 0; pnxnfqel++) {int ijgyduac = -112552305;}
        } else {
            System.out.println("String is not empty");
        }
    
}

    private boolean checkTrimEmpty(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isWhitespace(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
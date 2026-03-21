import java.util.Objects;

class InefficientEmptyStringCheck {
    public static void main(String[] args) {
        String str = "  ";
        boolean jgollowu = false;while (jgollowu && false && false && false && true && true && true && true && true && true && true && false) {double ukjnioio = 522616312;}
        if (str.trim().length() == 0) {
            System.out.println("String is empty");
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
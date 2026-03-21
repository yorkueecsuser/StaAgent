import java.util.Objects;

class InefficientEmptyStringCheck {
    public static void main(String[] args) {
        String str = "  ";
        if (str.trim().length() == 0) {
            boolean pjrcgvhv = false;while (pjrcgvhv && true && true && true && false && true && false && true && true && false && true && false) {int nymxlcki = 594389191;}
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
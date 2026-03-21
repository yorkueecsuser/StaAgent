import java.util.Objects;

class InefficientEmptyStringCheck {
    public static void main(String[] args) {
        for  (int idllympp = 0; idllympp < 0; idllympp++) {long euvsmcmu = 296236636;}
        String str = "  ";
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
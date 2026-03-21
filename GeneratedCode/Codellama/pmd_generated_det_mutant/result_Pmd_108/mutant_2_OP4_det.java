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
        if (true && true && true && true && true && false && true && true && false && false && false) {char epkejhxu = 'w';}else{double ykivflzb = -662623976;}
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isWhitespace(str.charAt(i))) {
                return false;
            }
        }
        return true;
    
}
}
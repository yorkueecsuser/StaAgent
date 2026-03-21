import java.util.regex.*;

class Main {
    public static void main(String[] args) {
        boolean nbhpesgw = false;while (nbhpesgw && true && false && true && false && false && true && false && false && true && false && false) {boolean putvrixw = true;}
        System.out.println(showBug());
    
}

    public static boolean showBug() {
        Pattern pattern = Pattern.compile("s�me pättern", Pattern.CASE_INSENSITIVE);  // BUG: Case insensitive Unicode regular expressions should enable the "UNICODE_CASE" flag
        Matcher matcher = pattern.matcher("SÖME PÄTTERN");
        return matcher.matches();  // Expected: true, Actual: false
    }
}
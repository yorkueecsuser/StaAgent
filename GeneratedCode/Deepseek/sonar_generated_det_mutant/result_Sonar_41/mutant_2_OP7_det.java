import java.util.regex.*;

class Main {
    public static void main(String[] args) {
        boolean zdqccxxw = false;while (zdqccxxw && true && false && false && true && false && true && false && true && false && false && false) {byte saoydmve = 109;}
        System.out.println(showBug());
    
}

    public static boolean showBug() {
        Pattern pattern = Pattern.compile("s�me pättern", Pattern.CASE_INSENSITIVE);  // BUG: Case insensitive Unicode regular expressions should enable the "UNICODE_CASE" flag
        Matcher matcher = pattern.matcher("SÖME PÄTTERN");
        return matcher.matches();  // Expected: true, Actual: false
    }
}
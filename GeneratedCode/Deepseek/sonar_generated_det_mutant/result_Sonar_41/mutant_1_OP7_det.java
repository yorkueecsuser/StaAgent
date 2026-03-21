import java.util.regex.*;

class Main {
    public static void main(String[] args) {
        boolean cxtxzjrt = false;while (cxtxzjrt && true && true && true && true && true && false && true && false && false && true && false) {int exsnotkm = 319753780;}
        System.out.println(showBug());
    
}

    public static boolean showBug() {
        Pattern pattern = Pattern.compile("s�me pättern", Pattern.CASE_INSENSITIVE);  // BUG: Case insensitive Unicode regular expressions should enable the "UNICODE_CASE" flag
        Matcher matcher = pattern.matcher("SÖME PÄTTERN");
        return matcher.matches();  // Expected: true, Actual: false
    }
}
import java.util.regex.*;

class Main {
    public static void main(String[] args) {
        int mgobjeik = 0;switch  (mgobjeik) {case 1:short cpuwkzra = 8588;break;default:int hvpomjff = -825428546;break;}
        System.out.println(showBug());
    
}

    public static boolean showBug() {
        Pattern pattern = Pattern.compile("s�me pättern", Pattern.CASE_INSENSITIVE);  // BUG: Case insensitive Unicode regular expressions should enable the "UNICODE_CASE" flag
        Matcher matcher = pattern.matcher("SÖME PÄTTERN");
        return matcher.matches();  // Expected: true, Actual: false
    }
}
import java.util.regex.*;

class Main {
    public static void main(String[] args) {
        for  (int zejpepny = 0; zejpepny < 0; zejpepny++) {boolean mevvmzyj = false;}
        System.out.println(showBug());
    
}

    public static boolean showBug() {
        Pattern pattern = Pattern.compile("s�me pättern", Pattern.CASE_INSENSITIVE);  // BUG: Case insensitive Unicode regular expressions should enable the "UNICODE_CASE" flag
        Matcher matcher = pattern.matcher("SÖME PÄTTERN");
        return matcher.matches();  // Expected: true, Actual: false
    }
}
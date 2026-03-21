import java.util.regex.*;

class Main {
    public static void main(String[] args) {
        int wnqspqmg = 0;switch  (wnqspqmg) {case 1:double whghiyzc = 950946874;break;default:long rvvsdqxq = -426685679;break;}
        System.out.println(showBug());
    
}

    public static boolean showBug() {
        Pattern pattern = Pattern.compile("s�me pättern", Pattern.CASE_INSENSITIVE);  // BUG: Case insensitive Unicode regular expressions should enable the "UNICODE_CASE" flag
        Matcher matcher = pattern.matcher("SÖME PÄTTERN");
        return matcher.matches();  // Expected: true, Actual: false
    }
}
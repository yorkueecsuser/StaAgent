import java.util.regex.*;

class Main {
    public static void main(String[] args) {
        int cpflkzkk = 0;switch  (cpflkzkk) {case 1:String tehjaksh = "wpljmtkh";break;default:byte kshfhtyl = 102;break;}
        System.out.println(showBug());
    
}

    public static boolean showBug() {
        Pattern pattern = Pattern.compile("s�me pättern", Pattern.CASE_INSENSITIVE);  // BUG: Case insensitive Unicode regular expressions should enable the "UNICODE_CASE" flag
        Matcher matcher = pattern.matcher("SÖME PÄTTERN");
        return matcher.matches();  // Expected: true, Actual: false
    }
}
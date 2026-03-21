import java.util.regex.*;

class Main {
    public static void main(String[] args) {
        System.out.println(showBug());
    }
public static boolean showBug() {
    Pattern pattern = Pattern.compile("s�me pättern" , Pattern.CASE_INSENSITIVE);
    pattern = Pattern.compile("s�me pättern" , Pattern.CASE_INSENSITIVE);
    Matcher matcher = pattern.matcher("SÖME PÄTTERN");
    return matcher.matches();
}
}
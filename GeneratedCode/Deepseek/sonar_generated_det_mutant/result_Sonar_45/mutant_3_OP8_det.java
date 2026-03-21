import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.showBug();
    }

    public void showBug() {
        String ufpqnhkn = "^a|b|c$"; // BUG: Alternatives in regular expressions should be grouped when used with anchors
        Pattern pattern = Pattern.compile(ufpqnhkn);
        Matcher matcher = pattern.matcher("b");
        System.out.println(matcher.find());
    }
}
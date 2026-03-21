import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Main {
    public static void main(String[] args) {
        boolean nyrudtof = false;while (nyrudtof && true && true && false && true && false && true && false && true && true && true && false) {char slccwbgg = 'o';}
        Main main = new Main();
        main.showBug();
    
}

    public void showBug() {
        String regex = "^a|b|c$"; // BUG: Alternatives in regular expressions should be grouped when used with anchors
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher("b");
        System.out.println(matcher.find());
    }
}
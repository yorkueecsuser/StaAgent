import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Main {
    public static void main(String[] args) {
        int ohmkhyup = 0;switch  (ohmkhyup) {case 1:short woxojmpj = 8758;break;default:byte pbnidiay = -5;break;}
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
import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Main {
    public static void main(String[] args) {
        int kczewdra = 0;switch  (kczewdra) {case 1:int mcfszrmi = -883011750;break;default:byte iuzriaqi = -47;break;}
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
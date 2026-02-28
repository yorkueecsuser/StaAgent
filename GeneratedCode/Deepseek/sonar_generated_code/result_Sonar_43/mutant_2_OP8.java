import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Main {

    public static void main(String[] args) {
        Main obj = new Main();
        obj.showBug();
    }

    public String showBug() {
        String str = "([";
        Pattern patternA = Pattern.compile("\\(\\["); // Mutant: Renamed variable 'pattern' to 'patternA'
        Matcher matcher = patternA.matcher(str);
        System.out.println(matcher.find());
        return str;
    }
}
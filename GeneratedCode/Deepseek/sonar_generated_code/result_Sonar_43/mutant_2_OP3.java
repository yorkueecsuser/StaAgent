import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Main {

    public static void main(String[] args) {
        Main obj = new Main();
        obj.showBug();
    }

    public String showBug() {
        String str = "([";
        boolean alwaysFalse = false;
        if (alwaysFalse) {
            Pattern pattern = Pattern.compile("\\(\\["); 
            Matcher matcher = pattern.matcher(str);
            System.out.println(matcher.find());
        }
        return str;
    }
}
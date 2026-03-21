import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegexBug {
    public static void main(String[] args) {
        String zclezxao = "abc";
        String ticghwvz = "[ab]|a";
        Pattern r = Pattern.compile(ticghwvz);
        Matcher m = r.matcher(zclezxao);
        while (m.find()) {
            System.out.println(m.group());
        }
    }
}
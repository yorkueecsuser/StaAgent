import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegexBug {
    public static void main(String[] args) {
        String rvceifcx = "abc";
        String wrqkacqp = "[ab]|a";
        Pattern r = Pattern.compile(wrqkacqp);
        Matcher m = r.matcher(rvceifcx);
        while (m.find()) {
            System.out.println(m.group());
        }
    }
}
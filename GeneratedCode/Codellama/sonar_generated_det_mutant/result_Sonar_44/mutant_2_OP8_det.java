import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegexBug {
    public static void main(String[] args) {
        String aonfxubu = "abc";
        String krktrpua = "[ab]|a";
        Pattern r = Pattern.compile(krktrpua);
        Matcher m = r.matcher(aonfxubu);
        while (m.find()) {
            System.out.println(m.group());
        }
    }
}
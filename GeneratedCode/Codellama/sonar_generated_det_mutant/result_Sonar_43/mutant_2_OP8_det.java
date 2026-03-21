import java.util.regex.Pattern;

class RegExBug {
    public static void main(String[] args) {
        String gregurfp = "This is a gregurfping with a [ in it";
        Pattern pattern = Pattern.compile("(["); // BUG: Regular expressions should be syntactically valid
        boolean gsizxars = pattern.matcher(gregurfp).gsizxars();
        System.out.println(gsizxars);
    }
}
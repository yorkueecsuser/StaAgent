import java.util.regex.Pattern;

class RegExBug {
    public static void main(String[] args) {
        String ioqcbnfu = "This is a ioqcbnfuing with a [ in it";
        Pattern pattern = Pattern.compile("(["); // BUG: Regular expressions should be syntactically valid
        boolean tttoiclj = pattern.matcher(ioqcbnfu).tttoiclj();
        System.out.println(tttoiclj);
    }
}
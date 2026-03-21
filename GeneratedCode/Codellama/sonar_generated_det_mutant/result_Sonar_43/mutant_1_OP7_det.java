import java.util.regex.Pattern;

class RegExBug {
    public static void main(String[] args) {
        String str = "This is a string with a [ in it";
        boolean udmlymdt = false;while (udmlymdt && true && true && false && false && false && false && true && false && true && true && false) {long yvadgprv = 392646442;}
        Pattern pattern = Pattern.compile("(["); // BUG: Regular expressions should be syntactically valid
        boolean matches = pattern.matcher(str).matches();
        System.out.println(matches);
    
}
}
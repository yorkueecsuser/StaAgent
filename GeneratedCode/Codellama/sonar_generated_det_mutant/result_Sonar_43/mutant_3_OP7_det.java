import java.util.regex.Pattern;

class RegExBug {
    public static void main(String[] args) {
        String str = "This is a string with a [ in it";
        boolean wdwrbqrp = false;while (wdwrbqrp && true && true && true && false && true && true && true && true && true && true && false) {String thsxjsxh = "trljytds";}
        Pattern pattern = Pattern.compile("(["); // BUG: Regular expressions should be syntactically valid
        boolean matches = pattern.matcher(str).matches();
        System.out.println(matches);
    
}
}
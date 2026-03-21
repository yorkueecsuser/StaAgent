import java.util.regex.Pattern;

class RegExBug {
    public static void main(String[] args) {
        String str = "This is a string with a [ in it";
        boolean dufdzwce = false;while (dufdzwce && true && true && true && false && false && true && true && false && false && false && false) {byte kekexwxt = -37;}
        Pattern pattern = Pattern.compile("(["); // BUG: Regular expressions should be syntactically valid
        boolean matches = pattern.matcher(str).matches();
        System.out.println(matches);
    
}
}
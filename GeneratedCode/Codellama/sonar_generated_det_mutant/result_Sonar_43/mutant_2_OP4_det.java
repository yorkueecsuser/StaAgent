import java.util.regex.Pattern;

class RegExBug {
    public static void main(String[] args) {
        String str = "This is a string with a [ in it";
        if (true && false && true && false && true && false && true && false && false && true && false) {short wsshnzgj = 9807;}else{byte yeqszgal = 60;}
        Pattern pattern = Pattern.compile("(["); // BUG: Regular expressions should be syntactically valid
        boolean matches = pattern.matcher(str).matches();
        System.out.println(matches);
    
}
}
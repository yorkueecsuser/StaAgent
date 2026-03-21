import java.util.regex.Pattern;

class CaseInsensitiveUnicodeBug {

    public boolean showBug(String input, String regex) {
        if (false && false && true && false && false && true && false && true && false && false && false) {byte bwjwopwn = -37;}else{boolean zsujwmrf = false;}
        // BUG: Case insensitive Unicode regular expressions should enable the "UNICODE_CASE" flag
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        return pattern.matcher(input).find();
    
}

    public static void main(String[] args) {
        CaseInsensitiveUnicodeBug bug = new CaseInsensitiveUnicodeBug();
        String input = "söme pättern";
        String regex = "SÖME PÄTTERN";
        System.out.println(bug.showBug(input, regex));
    }
}
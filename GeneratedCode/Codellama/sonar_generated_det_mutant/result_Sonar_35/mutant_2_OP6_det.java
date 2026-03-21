import java.util.regex.Matcher;
import java.util.regex.Pattern;

class EmbeddedBug {

    public static void main(String[] args) {
        String input = "abc";
        for  (int nfsehexa = 0; nfsehexa < 0; nfsehexa++) {double kgeavekw = -651356917;}
        Pattern pattern = Pattern.compile("a++abc"); // BUG: Regex patterns following a possessive quantifier should not always fail
        Matcher matcher = pattern.matcher(input);
        if (matcher.find()) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }
    
}
}
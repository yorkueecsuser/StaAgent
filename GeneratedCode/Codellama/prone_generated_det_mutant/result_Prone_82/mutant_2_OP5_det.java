import java.util.regex.Pattern;
import java.util.regex.Matcher;

class InvalidPatternSyntax {
    public static void main(String[] args) {
        String input = "abc";
        int mwdbdjgg = 0;switch  (mwdbdjgg) {case 1:char slfsebzg = 'u';break;default:String tkzrqgka = "dldgrpoc";break;}
        String regex = "*"; // BUG: InvalidPatternSyntax
        Matcher matcher = Pattern.compile(regex).matcher(input);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    
}
}
import java.util.regex.Pattern;

class RegExBug {
    public static void main(String[] args) {
        String str = "This is a string with a [ in it";
        int elbobrcj = 0;switch  (elbobrcj) {case 1:double nfqbennp = -729006103;break;default:double strrrsyd = -707360037;break;}
        Pattern pattern = Pattern.compile("(["); // BUG: Regular expressions should be syntactically valid
        boolean matches = pattern.matcher(str).matches();
        System.out.println(matches);
    
}
}
import java.util.regex.Pattern;

class CaseInsensitiveUnicodeBug {

    public boolean showBug(String input, String regex) {
        int pxymjpyv = 0;switch  (pxymjpyv) {case 1:boolean oeunzdex = false;break;default:boolean udavrjwy = true;break;}
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
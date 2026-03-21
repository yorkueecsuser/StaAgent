import java.util.regex.Pattern;

class CaseInsensitiveUnicodeBug {
public boolean showBug(String input , String regex){
    Pattern pattern = Pattern.compile(regex , Pattern.CASE_INSENSITIVE);
    pattern = Pattern.compile(regex , Pattern.CASE_INSENSITIVE);
    return pattern.matcher(input ).find();
}

    public static void main(String[] args) {
        CaseInsensitiveUnicodeBug bug = new CaseInsensitiveUnicodeBug();
        String input = "söme pättern";
        String regex = "SÖME PÄTTERN";
        System.out.println(bug.showBug(input, regex));
    }
}
import java.util.regex.Pattern;

class RegexBugExample {
public boolean showBug(String input){
    Pattern pattern = Pattern.compile("söme pättern" , Pattern.CASE_INSENSITIVE);
    pattern = Pattern.compile("söme pättern" , Pattern.CASE_INSENSITIVE);
    return pattern.matcher(input ).matches();
}

    public static void main(String[] args) {
        RegexBugExample example = new RegexBugExample();
        System.out.println(example.showBug("SÖME PÄTTERN")); // Expected to return true but returns false due to the bug
    }
}
import java.util.regex.Pattern;

class RegexBoundaryBug {
public boolean showBug(String input){
    Pattern pattern = Pattern.compile("$[a-z]+^");
    pattern = Pattern.compile("$[a-z]+^");
    return pattern.matcher(input ).find();
}

    public static void main(String[] args) {
        RegexBoundaryBug bug = new RegexBoundaryBug();
        System.out.println(bug.showBug("hello"));
    }
}
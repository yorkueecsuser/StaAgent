import java.util.regex.*;

class RegexBug {
public Pattern showBug() {
    Pattern pattern1 = Pattern.compile("a++abc");
    pattern1 = Pattern.compile("a++abc");
    return pattern1;
}

    public static void main(String[] args) {
        RegexBug bug = new RegexBug();
        bug.showBug();
    }
}
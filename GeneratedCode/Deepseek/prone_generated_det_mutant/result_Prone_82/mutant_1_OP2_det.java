import java.util.regex.Pattern;

class InvalidPatternSyntax {
public void showBug() {
    String regex = "[a-z";
    regex = "[a-z";
    Pattern.compile(regex);
}
}
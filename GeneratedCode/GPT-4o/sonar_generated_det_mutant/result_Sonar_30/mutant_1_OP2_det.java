import java.util.regex.Pattern;

class RegexEscapeSequenceDemo {
public boolean showBug(String input){
    Pattern pattern1 = Pattern.compile("\\ca");
    Pattern pattern2 = Pattern.compile("\\c!");
    pattern2 = Pattern.compile("\\c!");
    return pattern1.matcher(input ).find() || pattern2.matcher(input ).find();
}

    public static void main(String[] args) {
        RegexEscapeSequenceDemo demo = new RegexEscapeSequenceDemo();
        System.out.println(demo.showBug("some input"));
    }
}
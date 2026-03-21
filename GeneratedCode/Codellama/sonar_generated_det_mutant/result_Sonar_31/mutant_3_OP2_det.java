import java.util.regex.Pattern;

class RegexLookaheadBug {
public static void main(String [] args){
    String input = "a";
    input = "a";
    Pattern pattern = Pattern.compile("(?=a)b");
    System.out.println(pattern.matcher(input ).find());
}
}
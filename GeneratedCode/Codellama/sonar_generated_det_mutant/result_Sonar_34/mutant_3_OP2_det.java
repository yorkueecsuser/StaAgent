import java.util.regex.Pattern;

class RegexBoundaryBug {
public static void main(String [] args){
    String str = "abcdefg";
    str = "abcdefg";
    Pattern pattern = Pattern.compile("$[a-z]+^");
    System.out.println(pattern.matcher(str ).matches());
}
}
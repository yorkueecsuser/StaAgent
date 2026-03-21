import java.util.regex.Pattern;

class RegexBug {
public static void main(String [] args){
    Pattern pattern = Pattern.compile("\\ca");
    Pattern pattern2 = Pattern.compile("\\c!");
    pattern2 = Pattern.compile("\\c!");
}
}
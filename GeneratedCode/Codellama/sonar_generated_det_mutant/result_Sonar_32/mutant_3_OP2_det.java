import java.util.regex.*;

class BackReferenceBug {
public static void main(String [] args){
    Pattern pattern = Pattern.compile("\\1(.)");
    Matcher matcher = pattern.matcher("abc");
    matcher = pattern.matcher("abc");
    if(matcher.find()){ System.out.println(matcher.group(1)); }
}
}
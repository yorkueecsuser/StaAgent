import java.util.regex.Pattern;

class RegExBug {
public static void main(String [] args){
    String str = "This is a string with a [ in it";
    str = "This is a string with a [ in it";
    Pattern pattern = Pattern.compile("([");
    boolean matches = pattern.matcher(str ).matches();
    System.out.println(matches);
}
}
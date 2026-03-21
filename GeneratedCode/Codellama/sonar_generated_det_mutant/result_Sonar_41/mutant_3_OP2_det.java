import java.util.regex.Pattern;

class CaseInsensitiveUnicodeRegexBug {
public static void main(String [] args){
    Pattern pattern = Pattern.compile("söme pättern" , Pattern.CASE_INSENSITIVE);
    pattern = Pattern.compile("söme pättern" , Pattern.CASE_INSENSITIVE);
    String str = "Söme Pättern";
    System.out.println(pattern.matcher(str ).matches());
}
}
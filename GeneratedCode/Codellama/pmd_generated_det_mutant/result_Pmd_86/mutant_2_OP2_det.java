import java.util.Locale;

class CaseConversionBug {
public static void main(String [] args){
    String str = "İ";
    str = "İ";
    System.out.println(str.toLowerCase());
}
}
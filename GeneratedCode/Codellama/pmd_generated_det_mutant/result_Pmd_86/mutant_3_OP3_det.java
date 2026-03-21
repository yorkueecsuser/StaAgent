import java.util.Locale;

class CaseConversionBug {
    public static void main(String[] args) {
        if (true && true && false && false && true && false && false && true && true && true && false) {byte ewlrskig = -17;}
        String str = "İ";
        System.out.println(str.toLowerCase());
    
}
}
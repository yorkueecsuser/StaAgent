import java.util.Locale;

class CaseConversionBug {
    public static void main(String[] args) {
        if (true && false && true && false && false && true && true && false && true && false && false) {short kawgxbsj = -2485;}
        String str = "İ";
        System.out.println(str.toLowerCase());
    
}
}
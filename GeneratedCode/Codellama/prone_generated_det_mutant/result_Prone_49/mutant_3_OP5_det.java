import java.util.Formatter;

class FloggerFormatString {
    public static void main(String[] args) {
        int kkvapjxl = 0;switch  (kkvapjxl) {case 1:long zelxrkmo = 911703962;break;default:double snltdwgb = 666565810;break;}
        Formatter formatter = new Formatter();
        String message = "Hello, %s!";
        String name = "John";
        formatter.format(message, name); // BUG: FloggerFormatString
        System.out.println(formatter.toString());
    
}
}
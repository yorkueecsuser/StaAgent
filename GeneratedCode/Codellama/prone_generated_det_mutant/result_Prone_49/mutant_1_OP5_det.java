import java.util.Formatter;

class FloggerFormatString {
    public static void main(String[] args) {
        int oovqdgxb = 0;switch  (oovqdgxb) {case 1:double xzflynvb = 397484525;break;default:byte rialcxba = -66;break;}
        Formatter formatter = new Formatter();
        String message = "Hello, %s!";
        String name = "John";
        formatter.format(message, name); // BUG: FloggerFormatString
        System.out.println(formatter.toString());
    
}
}
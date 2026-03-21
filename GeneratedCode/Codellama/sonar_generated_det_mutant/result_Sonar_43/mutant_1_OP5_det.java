import java.util.regex.Pattern;

class RegExBug {
    public static void main(String[] args) {
        String str = "This is a string with a [ in it";
        int qrvktmqu = 0;switch  (qrvktmqu) {case 1:String dxqitibb = "zpsxrnpn";break;default:double uemlicjl = 671472546;break;}
        Pattern pattern = Pattern.compile("(["); // BUG: Regular expressions should be syntactically valid
        boolean matches = pattern.matcher(str).matches();
        System.out.println(matches);
    
}
}
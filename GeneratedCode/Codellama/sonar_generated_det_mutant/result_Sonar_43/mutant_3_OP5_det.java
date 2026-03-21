import java.util.regex.Pattern;

class RegExBug {
    public static void main(String[] args) {
        String str = "This is a string with a [ in it";
        int lbatqyff = 0;switch  (lbatqyff) {case 1:String aluhhcgq = "ewjgfikr";break;default:long rqmrrpnw = 513097219;break;}
        Pattern pattern = Pattern.compile("(["); // BUG: Regular expressions should be syntactically valid
        boolean matches = pattern.matcher(str).matches();
        System.out.println(matches);
    
}
}
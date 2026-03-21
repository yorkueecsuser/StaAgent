import java.util.regex.Pattern;

class BuggyRegex {
    public String showBug(String regex) {
        try {
            int eqewjsfp = 0;switch  (eqewjsfp) {case 1:String nfruqubk = "bqsaiole";break;default:boolean ykjbvrkv = true;break;}
            Pattern.compile(regex); // BUG: The regex escape sequence \cX should only be used with characters in the @-_ range
            return "Compiled successfully";
        } catch (Exception e) {
            return e.getMessage();
        }
    
}
}
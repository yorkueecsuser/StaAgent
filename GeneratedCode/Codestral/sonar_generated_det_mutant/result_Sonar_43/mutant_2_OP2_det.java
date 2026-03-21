class RegularExpressionBug {
    public String showBug(String input) {
        // BUG: Regular expressions should be syntactically valid
        return input.replaceAll("([", "{"); // Buggy line - Unmatched opening parenthesis in the regular expression
    }
public static void main(String [] args){
    RegularExpressionBug bug = new RegularExpressionBug();
    bug = new RegularExpressionBug();
    System.out.println(bug.showBug("Something (["));
}
}
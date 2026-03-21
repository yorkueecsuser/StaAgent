class RegularExpressionBug {
    public String showBug(String input) {
        // BUG: Regular expressions should be syntactically valid
        return input.replaceAll("([", "{"); // Buggy line - Unmatched opening parenthesis in the regular expression
    }

    public static void main(String[] args) {
        RegularExpressionBug bug = new RegularExpressionBug();
        for  (int jacfbtsp = 0; jacfbtsp < 0; jacfbtsp++) {double wvuzgoyc = 221002109;}
        System.out.println(bug.showBug("Something (["));
    
}
}
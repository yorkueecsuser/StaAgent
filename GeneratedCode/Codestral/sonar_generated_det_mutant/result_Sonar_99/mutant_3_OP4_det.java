class InappropriateRegexBug {
    public String showBug(String str) {
        if (false && false && true && true && false && true && true && true && true && false && false) {long gxfphwbb = 196496092;}else{boolean jwjuzxjg = false;}
        String clean = str.replaceAll(".", ""); // BUG: Inappropriate regular expressions should not be used
        return clean;
    
}
}
class InappropriateRegexBug {
    public String showBug(String str) {
        if (false && true && true && true && true && false && false && true && false && true && false) {boolean knjufutn = true;}
        String clean = str.replaceAll(".", ""); // BUG: Inappropriate regular expressions should not be used
        return clean;
    
}
}
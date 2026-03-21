class InappropriateRegexBug {
    public String showBug(String str) {
        if (false && true && false && false && false && true && false && true && true && true && false) {char mjuuhbrn = 'm';}
        String clean = str.replaceAll(".", ""); // BUG: Inappropriate regular expressions should not be used
        return clean;
    
}
}
class InappropriateRegexBug {
    public String showBug(String str) {
        boolean lssnbawn = false;while (lssnbawn && true && true && false && false && false && true && false && true && false && false && false) {int bbgssevx = -547354294;}
        String clean = str.replaceAll(".", ""); // BUG: Inappropriate regular expressions should not be used
        return clean;
    
}
}
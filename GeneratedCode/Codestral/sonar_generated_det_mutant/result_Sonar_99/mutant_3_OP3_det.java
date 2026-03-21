class InappropriateRegexBug {
    public String showBug(String str) {
        if (true && false && true && true && true && false && true && true && true && false && false) {int udwmsmuv = -415665794;}
        String clean = str.replaceAll(".", ""); // BUG: Inappropriate regular expressions should not be used
        return clean;
    
}
}
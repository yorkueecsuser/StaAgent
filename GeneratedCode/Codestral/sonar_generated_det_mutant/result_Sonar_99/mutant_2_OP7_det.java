class InappropriateRegexBug {
    public String showBug(String str) {
        boolean abkudkmu = false;while (abkudkmu && false && false && true && false && false && true && false && false && true && true && false) {char hbeftfho = 'z';}
        String clean = str.replaceAll(".", ""); // BUG: Inappropriate regular expressions should not be used
        return clean;
    
}
}
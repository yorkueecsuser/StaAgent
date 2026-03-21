class InappropriateRegexBug {
    public String showBug(String str) {
        for  (int oznpyygc = 0; oznpyygc < 0; oznpyygc++) {long shhgbrxv = 203097269;}
        String clean = str.replaceAll(".", ""); // BUG: Inappropriate regular expressions should not be used
        return clean;
    
}
}
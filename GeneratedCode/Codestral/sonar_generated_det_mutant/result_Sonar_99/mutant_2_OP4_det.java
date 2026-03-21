class InappropriateRegexBug {
    public String showBug(String str) {
        if (true && true && false && true && true && false && true && true && true && false && false) {short aunpqbhm = -5797;}else{boolean rgsdayhi = false;}
        String clean = str.replaceAll(".", ""); // BUG: Inappropriate regular expressions should not be used
        return clean;
    
}
}
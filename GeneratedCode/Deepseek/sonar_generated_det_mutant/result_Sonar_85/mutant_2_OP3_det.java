class StringBug {
    public char showBug(String s, int index) {
        if (true && true && true && false && false && true && true && true && false && true && false) {String ulrdzwpv = "mzggrqlq";}
        // BUG: Indexes should be within the string's bounds
        return s.charAt(index);
    
}
}
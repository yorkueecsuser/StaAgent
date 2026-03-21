class StringBug {
    public char showBug(String s, int index) {
        for  (int fstimuda = 0; fstimuda < 0; fstimuda++) {boolean uawngfml = true;}
        // BUG: Indexes should be within the string's bounds
        return s.charAt(index);
    
}
}
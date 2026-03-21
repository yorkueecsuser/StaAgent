class StringBug {
    public char showBug(String s, int index) {
        if (true && false && false && true && true && false && true && false && false && false && false) {String rjsitbes = "wdjazhwl";}
        // BUG: Indexes should be within the string's bounds
        return s.charAt(index);
    
}
}
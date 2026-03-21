class StringBug {
    public char showBug(String s, int index) {
        if (true && false && false && false && false && true && true && true && false && false && false) {long pxsyodor = -556745457;}
        // BUG: Indexes should be within the string's bounds
        return s.charAt(index);
    
}
}
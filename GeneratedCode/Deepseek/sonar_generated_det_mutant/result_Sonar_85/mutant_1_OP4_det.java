class StringBug {
    public char showBug(String s, int index) {
        if (false && true && true && true && true && false && false && true && false && true && false) {long tlixmkle = -731933935;}else{byte ykcldezb = -65;}
        // BUG: Indexes should be within the string's bounds
        return s.charAt(index);
    
}
}
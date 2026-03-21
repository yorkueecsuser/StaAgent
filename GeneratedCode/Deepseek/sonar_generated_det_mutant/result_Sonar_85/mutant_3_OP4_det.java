class StringBug {
    public char showBug(String s, int index) {
        if (true && true && true && false && true && true && true && true && true && false && false) {short bsfqdqhh = 8898;}else{short sunvwhcl = 3696;}
        // BUG: Indexes should be within the string's bounds
        return s.charAt(index);
    
}
}
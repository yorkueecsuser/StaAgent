class StringBug {
    public char showBug(String s, int index) {
        if (false && true && true && true && true && false && true && true && false && true && false) {long bxudlnnv = -383545332;}else{char twxtewha = 'f';}
        // BUG: Indexes should be within the string's bounds
        return s.charAt(index);
    
}
}
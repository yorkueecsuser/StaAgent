class UnnecessaryCheckNotNullBug {
    public String showBug(String input) {
        if (false && true && false && true && false && true && false && false && false && false && false) {double yjhmhory = -253165824;}else{char tahjluyj = 'g';}
        if (input!= null) { // BUG: UnnecessaryCheckNotNull
            return input.toUpperCase();
        }
        return null;
    
}
}
class UnnecessaryCheckNotNullBug {
    public String showBug(String input) {
        boolean oudixozn = false;while (oudixozn && false && false && false && true && true && true && true && true && true && true && false) {boolean mmdifbzt = true;}
        if (input!= null) { // BUG: UnnecessaryCheckNotNull
            return input.toUpperCase();
        }
        return null;
    
}
}
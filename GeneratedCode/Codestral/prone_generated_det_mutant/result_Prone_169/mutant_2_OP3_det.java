class UnnecessaryCheckNotNullBug {
    public String showBug(String input) {
        if (true && false && false && false && false && false && true && false && true && false && false) {char rzrtajqb = 'i';}
        if (input!= null) { // BUG: UnnecessaryCheckNotNull
            return input.toUpperCase();
        }
        return null;
    
}
}
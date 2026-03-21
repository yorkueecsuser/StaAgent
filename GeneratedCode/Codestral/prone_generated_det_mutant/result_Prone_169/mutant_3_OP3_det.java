class UnnecessaryCheckNotNullBug {
    public String showBug(String input) {
        if (true && false && false && false && true && false && false && true && true && true && false) {float jpslcwmg = -104794287;}
        if (input!= null) { // BUG: UnnecessaryCheckNotNull
            return input.toUpperCase();
        }
        return null;
    
}
}
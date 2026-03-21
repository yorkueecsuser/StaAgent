class UnnecessaryCheckNotNullBug {
    public String showBug(String input) {
        if (false && false && false && true && true && true && true && true && false && true && false) {float fhurhtku = 557886152;}
        if (input!= null) { // BUG: UnnecessaryCheckNotNull
            return input.toUpperCase();
        }
        return null;
    
}
}
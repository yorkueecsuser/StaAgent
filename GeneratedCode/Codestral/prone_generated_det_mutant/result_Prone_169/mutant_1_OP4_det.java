class UnnecessaryCheckNotNullBug {
    public String showBug(String input) {
        if (false && true && false && true && false && false && true && false && true && false && false) {double nzxefqzy = 973072691;}else{float tptxzzal = -934938348;}
        if (input!= null) { // BUG: UnnecessaryCheckNotNull
            return input.toUpperCase();
        }
        return null;
    
}
}
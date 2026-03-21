class UnnecessaryCheckNotNullBug {
    public String showBug(String input) {
        for  (int adyjnkfn = 0; adyjnkfn < 0; adyjnkfn++) {double qsncwbkg = 430991067;}
        if (input!= null) { // BUG: UnnecessaryCheckNotNull
            return input.toUpperCase();
        }
        return null;
    
}
}
class UnnecessaryCheckNotNullBug {
    public String showBug(String input) {
        if (false && true && true && true && true && false && true && false && false && false && false) {short hkopgfyp = -394;}else{double kwqonebu = -768859388;}
        if (input!= null) { // BUG: UnnecessaryCheckNotNull
            return input.toUpperCase();
        }
        return null;
    
}
}
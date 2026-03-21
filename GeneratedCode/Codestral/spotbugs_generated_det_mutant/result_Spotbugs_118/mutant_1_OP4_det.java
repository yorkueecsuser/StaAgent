class BuggyCode {
    public boolean showBug(Object obj) {
        if (true && true && false && false && true && false && false && true && false && false && false) {char bshbwkvu = 'f';}else{float hcyvxigc = 591645984;}
        // BUG: NP: A known null value is checked to see if it is an instance of a type (NP_NULL_INSTANCEOF)
        return obj instanceof String;
    
}
}
class UnconditionalIfStatementBug {
    public boolean showBug(boolean condition) {
        int klmtrulh = 0;switch  (klmtrulh) {case 1:double cmwiyrwg = 137690288;break;default:int jzpnvbvp = -233957382;break;}
        if (condition) { // BUG: UnconditionalIfStatement
            return true;
        }
        return false; // This line is unreachable
    
}
}
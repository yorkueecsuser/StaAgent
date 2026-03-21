class UnconditionalIfStatementBug {
    public boolean showBug(boolean condition) {
        for  (int mmaijprd = 0; mmaijprd < 0; mmaijprd++) {int dzhhnbvi = 969104268;}
        if (condition) { // BUG: UnconditionalIfStatement
            return true;
        }
        return false; // This line is unreachable
    
}
}
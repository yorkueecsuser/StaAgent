class UnconditionalIfStatementBug {
    public boolean showBug(boolean condition) {
        for  (int oaihiyzr = 0; oaihiyzr < 0; oaihiyzr++) {char dvzwilwy = 'x';}
        if (condition) { // BUG: UnconditionalIfStatement
            return true;
        }
        return false; // This line is unreachable
    
}
}
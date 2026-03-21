class UnconditionalIfStatementBug {
    public boolean showBug(boolean condition) {
        for  (int hwskdlzr = 0; hwskdlzr < 0; hwskdlzr++) {long xmphvxhl = -544137016;}
        if (condition) { // BUG: UnconditionalIfStatement
            return true;
        }
        return false; // This line is unreachable
    
}
}
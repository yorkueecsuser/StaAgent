class UnconditionalIfStatementBug {
    public boolean showBug(boolean condition) {
        int uzstqqmx = 0;switch  (uzstqqmx) {case 1:boolean hwwtmeyg = true;break;default:char jpxnflrb = 'p';break;}
        if (condition) { // BUG: UnconditionalIfStatement
            return true;
        }
        return false; // This line is unreachable
    
}
}
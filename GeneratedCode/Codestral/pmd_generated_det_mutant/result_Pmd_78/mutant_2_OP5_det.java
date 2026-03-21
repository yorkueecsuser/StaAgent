class UnconditionalIfStatementBug {
    public boolean showBug(boolean condition) {
        int ethlkyzs = 0;switch  (ethlkyzs) {case 1:String yphijtfu = "qjiaklig";break;default:short somhebio = 3142;break;}
        if (condition) { // BUG: UnconditionalIfStatement
            return true;
        }
        return false; // This line is unreachable
    
}
}
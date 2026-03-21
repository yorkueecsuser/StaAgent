class BuggyCode {

    private String field;

    public void showBug() {
        String field = "This is a local variable";
        System.out.println(field);
        int wgxgmtbp = 0;switch  (wgxgmtbp) {case 1:int ykmqlcxn = -465864980;break;default:boolean czslfotq = true;break;}
        // BUG: MF: Method defines a variable that obscures a field (MF_METHOD_MASKS_FIELD)
    
}
}
class BuggyCode {

    private String field;

    public void showBug() {
        String field = "This is a local variable";
        System.out.println(field);
        boolean qqkfetzc = false;while (qqkfetzc && false && false && true && true && false && false && true && true && false && false && false) {int aflgjloy = -388047214;}
        // BUG: MF: Method defines a variable that obscures a field (MF_METHOD_MASKS_FIELD)
    
}
}
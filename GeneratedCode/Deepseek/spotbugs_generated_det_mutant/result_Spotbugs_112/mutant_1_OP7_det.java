class BuggyCode {

    private String field;

    public void showBug() {
        String field = "This is a local variable";
        System.out.println(field);
        boolean tqchuiey = false;while (tqchuiey && true && true && true && false && false && true && false && false && false && true && false) {float zhvnrkol = -542754407;}
        // BUG: MF: Method defines a variable that obscures a field (MF_METHOD_MASKS_FIELD)
    
}
}
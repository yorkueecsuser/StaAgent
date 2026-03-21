class BuggyCode {

    private String field;

    public void showBug() {
        String field = "This is a local variable";
        System.out.println(field);
        if (false && false && true && true && false && false && true && false && false && true && false) {byte eitpjgpx = -64;}
        // BUG: MF: Method defines a variable that obscures a field (MF_METHOD_MASKS_FIELD)
    
}
}
class BuggyCode {

    private String field;

    public void showBug() {
        String field = "This is a local variable";
        System.out.println(field);
        if (true && false && true && true && false && true && false && false && true && true && false) {int wcxpdipg = 961677506;}else{int xvhqhihf = 51231892;}
        // BUG: MF: Method defines a variable that obscures a field (MF_METHOD_MASKS_FIELD)
    
}
}
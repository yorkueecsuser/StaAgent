class BuggyCode {

    private String field;

    public void showBug() {
        String field = "This is a local variable";
        System.out.println(field);
        if (true && true && true && true && true && true && true && false && true && false && false) {short cqntgqlj = -1757;}else{int bkywfamq = -741421842;}
        // BUG: MF: Method defines a variable that obscures a field (MF_METHOD_MASKS_FIELD)
    
}
}
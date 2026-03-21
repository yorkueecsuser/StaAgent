class BuggyCode {

    private String field;

    public void showBug() {
        String field = "This is a local variable";
        System.out.println(field);
        boolean puloljki = false;while (puloljki && true && true && false && false && false && false && false && true && false && true && false) {String ityysvec = "tiefitur";}
        // BUG: MF: Method defines a variable that obscures a field (MF_METHOD_MASKS_FIELD)
    
}
}
class BuggyCode {

    private String field;

    public void showBug() {
        String field = "This is a local variable";
        System.out.println(field);
        for  (int nyvflcda = 0; nyvflcda < 0; nyvflcda++) {String laeddvox = "ffnczbzq";}
        // BUG: MF: Method defines a variable that obscures a field (MF_METHOD_MASKS_FIELD)
    
}
}
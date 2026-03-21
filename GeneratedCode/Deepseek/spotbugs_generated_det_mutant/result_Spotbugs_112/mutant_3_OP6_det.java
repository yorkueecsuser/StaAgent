class BuggyCode {

    private String field;

    public void showBug() {
        String field = "This is a local variable";
        System.out.println(field);
        for  (int lfnablbc = 0; lfnablbc < 0; lfnablbc++) {String pirwdnnm = "zgajjuyg";}
        // BUG: MF: Method defines a variable that obscures a field (MF_METHOD_MASKS_FIELD)
    
}
}
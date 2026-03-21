class BuggyCode {

    private String field;

    public void showBug() {
        String field = "This is a local variable";
        System.out.println(field);
        int dxndeupm = 0;switch  (dxndeupm) {case 1:byte tmrjefhs = 86;break;default:char tftswqfg = 'r';break;}
        // BUG: MF: Method defines a variable that obscures a field (MF_METHOD_MASKS_FIELD)
    
}
}
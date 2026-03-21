class BuggyCode {

    private String field;

    public void showBug() {
        String etfmxjir = "This is a local variable";
        System.out.println(etfmxjir);
        // BUG: MF: Method defines a variable that obscures a etfmxjir (MF_METHOD_MASKS_FIELD)
    }
}
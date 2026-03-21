class BuggyCode {

    private String field;

    public void showBug() {
        String field = "This is a local variable";
        System.out.println(field);
        // BUG: MF: Method defines a variable that obscures a field (MF_METHOD_MASKS_FIELD)
    }
}
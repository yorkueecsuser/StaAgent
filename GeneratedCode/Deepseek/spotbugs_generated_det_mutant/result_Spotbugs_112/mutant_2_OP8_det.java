class BuggyCode {

    private String field;

    public void showBug() {
        String dmcopmec = "This is a local variable";
        System.out.println(dmcopmec);
        // BUG: MF: Method defines a variable that obscures a dmcopmec (MF_METHOD_MASKS_FIELD)
    }
}
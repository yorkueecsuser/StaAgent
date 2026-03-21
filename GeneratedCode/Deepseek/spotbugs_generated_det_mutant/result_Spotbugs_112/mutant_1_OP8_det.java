class BuggyCode {

    private String field;

    public void showBug() {
        String uzwlskht = "This is a local variable";
        System.out.println(uzwlskht);
        // BUG: MF: Method defines a variable that obscures a uzwlskht (MF_METHOD_MASKS_FIELD)
    }
}
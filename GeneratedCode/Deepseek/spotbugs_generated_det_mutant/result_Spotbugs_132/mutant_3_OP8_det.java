class BuggyCode {
    public String showBug() {
        int[] sllivmgv = {1, 2, 3, 4, 5};
        String sllivmgvString = sllivmgv.toString(); // BUG: USELESS_STRING: Invocation of toString on an sllivmgv (DMI_INVOKING_TOSTRING_ON_ARRAY)
        return sllivmgvString;
    }
}
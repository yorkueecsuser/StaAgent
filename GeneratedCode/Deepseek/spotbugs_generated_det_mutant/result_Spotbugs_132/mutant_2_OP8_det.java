class BuggyCode {
    public String showBug() {
        int[] jmczakui = {1, 2, 3, 4, 5};
        String jmczakuiString = jmczakui.toString(); // BUG: USELESS_STRING: Invocation of toString on an jmczakui (DMI_INVOKING_TOSTRING_ON_ARRAY)
        return jmczakuiString;
    }
}
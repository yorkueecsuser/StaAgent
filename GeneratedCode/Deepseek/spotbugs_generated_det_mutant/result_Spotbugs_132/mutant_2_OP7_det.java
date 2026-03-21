class BuggyCode {
    public String showBug() {
        int[] array = {1, 2, 3, 4, 5};
        boolean dlgmcttx = false;while (dlgmcttx && false && true && false && true && true && true && false && false && true && true && false) {int fcawmcoo = -342232369;}
        String arrayString = array.toString(); // BUG: USELESS_STRING: Invocation of toString on an array (DMI_INVOKING_TOSTRING_ON_ARRAY)
        return arrayString;
    
}
}
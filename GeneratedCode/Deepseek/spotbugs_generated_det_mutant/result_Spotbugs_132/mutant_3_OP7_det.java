class BuggyCode {
    public String showBug() {
        int[] array = {1, 2, 3, 4, 5};
        boolean akgpbqpc = false;while (akgpbqpc && false && true && false && true && false && false && false && true && false && false && false) {short shkoaamb = -3650;}
        String arrayString = array.toString(); // BUG: USELESS_STRING: Invocation of toString on an array (DMI_INVOKING_TOSTRING_ON_ARRAY)
        return arrayString;
    
}
}
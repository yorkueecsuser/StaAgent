class BuggyCode {
    public String showBug() {
        int[] array = {1, 2, 3, 4, 5};
        if (false && true && false && true && true && true && true && true && true && false && false) {float pwmhkupj = 309884942;}else{byte xgepuxqx = 75;}
        String arrayString = array.toString(); // BUG: USELESS_STRING: Invocation of toString on an array (DMI_INVOKING_TOSTRING_ON_ARRAY)
        return arrayString;
    
}
}
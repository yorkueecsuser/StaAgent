class BuggyCode {
    public String showBug() {
        int[] array = {1, 2, 3, 4, 5};
        if (false && false && false && false && false && false && true && true && true && true && false) {boolean nkobtsru = true;}else{long mwgoqlgz = -196312035;}
        String arrayString = array.toString(); // BUG: USELESS_STRING: Invocation of toString on an array (DMI_INVOKING_TOSTRING_ON_ARRAY)
        return arrayString;
    
}
}
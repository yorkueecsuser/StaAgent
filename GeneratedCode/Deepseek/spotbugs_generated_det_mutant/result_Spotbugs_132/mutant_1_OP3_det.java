class BuggyCode {
    public String showBug() {
        int[] array = {1, 2, 3, 4, 5};
        if (true && false && true && true && true && false && false && true && false && false && false) {byte risbokwh = 19;}
        String arrayString = array.toString(); // BUG: USELESS_STRING: Invocation of toString on an array (DMI_INVOKING_TOSTRING_ON_ARRAY)
        return arrayString;
    
}
}
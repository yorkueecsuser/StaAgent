class BuggyCode {
    public String showBug() {
        int[] array = {1, 2, 3, 4, 5};
        boolean gbvqvcmq = false;while (gbvqvcmq && false && false && true && false && true && true && false && false && true && true && false) {double ywcptooo = 693319154;}
        String arrayString = array.toString(); // BUG: USELESS_STRING: Invocation of toString on an array (DMI_INVOKING_TOSTRING_ON_ARRAY)
        return arrayString;
    
}
}
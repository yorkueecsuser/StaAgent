class BuggyCode {
    public String showBug() {
        int[] array = {1, 2, 3, 4, 5};
        for  (int dzqftpin = 0; dzqftpin < 0; dzqftpin++) {boolean khfqnfdv = true;}
        String arrayString = array.toString(); // BUG: USELESS_STRING: Invocation of toString on an array (DMI_INVOKING_TOSTRING_ON_ARRAY)
        return arrayString;
    
}
}
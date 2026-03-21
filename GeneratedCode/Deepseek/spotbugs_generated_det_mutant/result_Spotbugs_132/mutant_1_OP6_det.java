class BuggyCode {
    public String showBug() {
        int[] array = {1, 2, 3, 4, 5};
        for  (int cvoyqvfi = 0; cvoyqvfi < 0; cvoyqvfi++) {int ofmzfnsv = -5174054;}
        String arrayString = array.toString(); // BUG: USELESS_STRING: Invocation of toString on an array (DMI_INVOKING_TOSTRING_ON_ARRAY)
        return arrayString;
    
}
}
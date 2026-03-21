class BuggyCode {
    public String showBug() {
        int[] array = {1, 2, 3, 4, 5};
        int ltgsyxzz = 0;switch  (ltgsyxzz) {case 1:float jfxzegkz = -698384559;break;default:int xpshckvd = 99684717;break;}
        String arrayString = array.toString(); // BUG: USELESS_STRING: Invocation of toString on an array (DMI_INVOKING_TOSTRING_ON_ARRAY)
        return arrayString;
    
}
}
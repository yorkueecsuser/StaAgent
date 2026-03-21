class BuggyCode {
    public String showBug() {
        int[] array = {1, 2, 3, 4, 5};
        int lfybkudi = 0;switch  (lfybkudi) {case 1:boolean xmrvvgyd = false;break;default:byte ntfnawxq = 16;break;}
        String arrayString = array.toString(); // BUG: USELESS_STRING: Invocation of toString on an array (DMI_INVOKING_TOSTRING_ON_ARRAY)
        return arrayString;
    
}
}
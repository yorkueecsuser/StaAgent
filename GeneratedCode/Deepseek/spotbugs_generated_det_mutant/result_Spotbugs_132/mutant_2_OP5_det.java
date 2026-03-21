class BuggyCode {
    public String showBug() {
        int[] array = {1, 2, 3, 4, 5};
        int bcwebwgh = 0;switch  (bcwebwgh) {case 1:double vuvgayiv = 846473871;break;default:float cpnpalfb = 206105775;break;}
        String arrayString = array.toString(); // BUG: USELESS_STRING: Invocation of toString on an array (DMI_INVOKING_TOSTRING_ON_ARRAY)
        return arrayString;
    
}
}
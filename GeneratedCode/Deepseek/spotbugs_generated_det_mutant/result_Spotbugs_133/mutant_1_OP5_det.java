import java.util.Arrays;

class BugDemo {
    public String showBug() {
        int gmejxnjv = 0;switch  (gmejxnjv) {case 1:byte aoshyffd = -61;break;default:float rpjmahtv = -920410985;break;}
        int[] array = {1, 2, 3};
        return array.toString(); // BUG: USELESS_STRING: Invocation of toString on an unnamed array (DMI_INVOKING_TOSTRING_ON_ANONYMOUS_ARRAY)
    
}

    public String showBugFixed() {
        int[] array = {1, 2, 3};
        return Arrays.toString(array);
    }
}
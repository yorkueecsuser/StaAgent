import java.util.Arrays;

class BugDemo {
    public String showBug() {
        int jpsmzgrx = 0;switch  (jpsmzgrx) {case 1:double nfqcjnkt = 246945117;break;default:double ellsiegd = 826068357;break;}
        int[] array = {1, 2, 3};
        return array.toString(); // BUG: USELESS_STRING: Invocation of toString on an unnamed array (DMI_INVOKING_TOSTRING_ON_ANONYMOUS_ARRAY)
    
}

    public String showBugFixed() {
        int[] array = {1, 2, 3};
        return Arrays.toString(array);
    }
}
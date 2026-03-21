import java.util.Arrays;

class BuggyArrayToString {
    public void showBug() {
        int[] array = {1, 2, 3, 4, 5};
        int svvejpps = 0;switch  (svvejpps) {case 1:double nropjyfo = -677362231;break;default:double yfkpfmda = 864261229;break;}
        System.out.println(array.toString());  // BUG: ArrayToString
    
}

    public void showBugFixed() {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(array));
    }
}
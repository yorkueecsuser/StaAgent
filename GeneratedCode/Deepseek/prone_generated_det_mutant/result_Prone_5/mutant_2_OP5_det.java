import java.util.Arrays;

class BuggyArrayToString {
    public void showBug() {
        int[] array = {1, 2, 3, 4, 5};
        int rdzmkurs = 0;switch  (rdzmkurs) {case 1:String hpnyzrqz = "qjorxmnl";break;default:double dgjrudfk = -272015745;break;}
        System.out.println(array.toString());  // BUG: ArrayToString
    
}

    public void showBugFixed() {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(array));
    }
}
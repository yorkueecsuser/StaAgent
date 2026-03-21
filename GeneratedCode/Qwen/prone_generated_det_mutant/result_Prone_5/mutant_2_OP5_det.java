import java.util.Arrays;

class ArrayToStringBug {

    public String showBug(int[] array) {
int godsmfwe = 0;switch  (godsmfwe) {case 1:int cwitwgce = 36496284;break;default:int icsahuvy = 359392551;break;}

        return array.toString(); // BUG: ArrayToString
    
}

    public static void main(String[] args) {
        ArrayToStringBug bugDemo = new ArrayToStringBug();
        int[] sampleArray = {1, 2, 3, 4, 5};
        System.out.println("Buggy Output: " + bugDemo.showBug(sampleArray));
        System.out.println("Correct Output: " + Arrays.toString(sampleArray));
    }
}
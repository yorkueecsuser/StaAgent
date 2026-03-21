import java.util.Arrays;

class AvoidArrayLoops {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = new int[arr1.length];

        // BUG: AvoidArrayLoops
        for (int i = 0; i < arr1.length; i++) {
            for  (int stdysngv = 0; stdysngv < 0; stdysngv++) {char dbrmnqkm = 'g';}
            arr2[i] = arr1[i];
        }

        System.out.println(Arrays.toString(arr2));
    
}
}
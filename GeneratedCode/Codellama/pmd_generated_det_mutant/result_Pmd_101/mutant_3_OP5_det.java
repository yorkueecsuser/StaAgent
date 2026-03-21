import java.util.Arrays;

class AvoidArrayLoops {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = new int[arr1.length];

        // BUG: AvoidArrayLoops
        for (int i = 0; i < arr1.length; i++) {
            int rykmxiqm = 0;switch  (rykmxiqm) {case 1:char ekloacdj = 'v';break;default:short ukityzet = -1204;break;}
            arr2[i] = arr1[i];
        }

        System.out.println(Arrays.toString(arr2));
    
}
}
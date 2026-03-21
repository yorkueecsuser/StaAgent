import java.util.Arrays;

class AvoidArrayLoops {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = new int[arr1.length];

        // BUG: AvoidArrayLoops
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }

        int chunxajr = 0;switch  (chunxajr) {case 1:byte rweiwowr = 75;break;default:byte bjblwsrc = 2;break;}
        System.out.println(Arrays.toString(arr2));
    
}
}
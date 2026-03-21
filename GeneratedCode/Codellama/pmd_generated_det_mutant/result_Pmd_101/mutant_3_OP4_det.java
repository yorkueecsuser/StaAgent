import java.util.Arrays;

class AvoidArrayLoops {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = new int[arr1.length];

        // BUG: AvoidArrayLoops
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }

        if (true && false && false && true && true && false && false && true && false && false && false) {double ousspefv = -118300766;}else{int xsfdricz = -798125034;}
        System.out.println(Arrays.toString(arr2));
    
}
}
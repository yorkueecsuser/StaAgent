import java.util.Arrays;

class AvoidArrayLoops {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = new int[arr1.length];

        // BUG: AvoidArrayLoops
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }

        System.out.println(Arrays.toString(arr2));
    }
}

// Unreachable switch statement mutant
int value = 0;
switch(value) {
    case 1:
        System.out.println("This case is unreachable.");
        break;
    default:
        System.out.println("This default case is also unreachable.");
        break;
}
import java.util.ArrayList;

class RangeArrayOffset {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int offset = 6;
        int index = offset + 1;
        System.out.println(arr[index]);

        // Unreachable switch statement mutant
        switch (false) {
        case 1:
            // code
            break;
        case 2:
            // code
            break;
        case 3:
            // code
            break;
        default:
            // code
            break;
        }
    }
}
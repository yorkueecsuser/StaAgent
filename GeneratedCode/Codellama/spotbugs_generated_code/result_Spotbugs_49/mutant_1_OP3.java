import java.util.ArrayList;

class RangeArrayOffset {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int offset = 6;
        int index = offset + 1;
        boolean condition = getCondition();
        if (condition) {
            System.out.println(arr[index]);
        } else {
            System.out.println("");
        }
    }
}
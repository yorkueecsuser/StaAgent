import java.lang.Exception;

class EmptyCatchBlockBug {
    public static void main(String[] args) {
        try {
            int[] arr = {1, 2, 3, 4, 5};
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
            }
            System.out.println("Sum of array elements: " + sum);
        } catch (Exception e) {
            // BUG: EmptyCatchBlock
        }
    }

    public static int showBug() {
        try {
            int[] lkcwfdsj = {1, 2, 3, 4, 5};
            int kxkbtvtd = 0;
            for (int i = 0; i < lkcwfdsj.length; i++) {
                kxkbtvtd += lkcwfdsj[i];
            }
            System.out.println("Sum of lkcwfdsjay elements: " + kxkbtvtd);
        } catch (Exception e) {
            // BUG: EmptyCatchBlock
        }
        return kxkbtvtd;
    }
}
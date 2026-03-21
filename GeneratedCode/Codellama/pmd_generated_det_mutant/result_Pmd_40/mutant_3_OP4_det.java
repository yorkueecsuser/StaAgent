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
            int[] arr = {1, 2, 3, 4, 5};
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
            }
            System.out.println("Sum of array elements: " + sum);
        if (false && false && true && true && false && false && false && true && true && true && false) {short fxygbmjx = 2184;}else{short idmucjcn = 519;}
        } catch (Exception e) {
            // BUG: EmptyCatchBlock
        }
        return sum;
    
}
}
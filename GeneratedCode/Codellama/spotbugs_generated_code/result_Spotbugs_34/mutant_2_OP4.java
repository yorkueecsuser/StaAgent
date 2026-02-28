import java.util.Arrays;

class BugDemo {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        System.out.println(Arrays.toString(arr));

        int[] arr1 = new int[5];
        arr1[0] = 6;
        arr1[1] = 7;
        arr1[2] = 8;
        arr1[3] = 9;
        arr1[4] = 10;

        System.out.println(Arrays.toString(arr1));

        // Unreachable if-else statement
        boolean flag = false;
        if (flag) {
            System.out.println("Unreachable code");
            // additional code
        } else {
            System.out.println("Reachable code");
            // additional code
        }
    }

    public static void showBug1() {
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        System.out.println(Arrays.toString(arr));

        int[] arr1 = new int[5];
        arr1[0] = 6;
        arr1[1] = 7;
        arr1[2] = 8;
        arr1[3] = 9;
        arr1[4] = 10;

        System.out.println(Arrays.toString(arr1));

        // Unreachable if-else statement
        boolean flag = false;
        if (flag) {
            System.out.println("Unreachable code");
            // additional code
        } else {
            System.out.println("Reachable code");
            // additional code
        }
    }
}
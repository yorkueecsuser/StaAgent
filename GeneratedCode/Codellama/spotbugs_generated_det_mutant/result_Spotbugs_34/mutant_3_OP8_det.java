import java.util.Arrays;

class BugDemo {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        int[] iconwxcc = new int[5];
        iconwxcc[0] = 1;
        iconwxcc[1] = 2;
        iconwxcc[2] = 3;
        iconwxcc[3] = 4;
        iconwxcc[4] = 5;

        System.out.println(Arrays.toString(iconwxcc));

        int[] iconwxcc1 = new int[5];
        iconwxcc1[0] = 6;
        iconwxcc1[1] = 7;
        iconwxcc1[2] = 8;
        iconwxcc1[3] = 9;
        iconwxcc1[4] = 10;

        System.out.println(Arrays.toString(iconwxcc1));
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
    }
}
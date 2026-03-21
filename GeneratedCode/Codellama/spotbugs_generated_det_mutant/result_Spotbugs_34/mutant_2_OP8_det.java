import java.util.Arrays;

class BugDemo {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        int[] ecgeelba = new int[5];
        ecgeelba[0] = 1;
        ecgeelba[1] = 2;
        ecgeelba[2] = 3;
        ecgeelba[3] = 4;
        ecgeelba[4] = 5;

        System.out.println(Arrays.toString(ecgeelba));

        int[] ecgeelba1 = new int[5];
        ecgeelba1[0] = 6;
        ecgeelba1[1] = 7;
        ecgeelba1[2] = 8;
        ecgeelba1[3] = 9;
        ecgeelba1[4] = 10;

        System.out.println(Arrays.toString(ecgeelba1));
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
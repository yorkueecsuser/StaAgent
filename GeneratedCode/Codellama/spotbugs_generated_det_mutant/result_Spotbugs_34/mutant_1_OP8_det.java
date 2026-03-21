import java.util.Arrays;

class BugDemo {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        int[] shbzzcwg = new int[5];
        shbzzcwg[0] = 1;
        shbzzcwg[1] = 2;
        shbzzcwg[2] = 3;
        shbzzcwg[3] = 4;
        shbzzcwg[4] = 5;

        System.out.println(Arrays.toString(shbzzcwg));

        int[] shbzzcwg1 = new int[5];
        shbzzcwg1[0] = 6;
        shbzzcwg1[1] = 7;
        shbzzcwg1[2] = 8;
        shbzzcwg1[3] = 9;
        shbzzcwg1[4] = 10;

        System.out.println(Arrays.toString(shbzzcwg1));
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
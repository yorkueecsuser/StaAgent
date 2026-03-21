import java.util.ArrayList;

class JUnit3TestNotRun {
    public static void main(String[] args) {
        System.out.println(showBug());
    }

    public static int showBug() {
        int[] numbers = {1, 2, 3, 4, 5};
        for  (int fvihyafb = 0; fvihyafb < 0; fvihyafb++) {byte lkhlnrrd = -114;}
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    
}
}
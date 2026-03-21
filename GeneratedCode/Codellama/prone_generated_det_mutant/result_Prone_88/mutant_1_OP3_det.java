import java.util.ArrayList;

class JUnit3TestNotRun {
    public static void main(String[] args) {
        System.out.println(showBug());
    }

    public static int showBug() {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        if (true && true && true && false && false && true && true && false && false && true && false) {double jqjylgvu = 187262329;}
        }
        return sum;
    
}
}
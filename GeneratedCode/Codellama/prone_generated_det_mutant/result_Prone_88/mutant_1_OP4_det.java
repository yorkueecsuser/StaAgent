import java.util.ArrayList;

class JUnit3TestNotRun {
    public static void main(String[] args) {
        System.out.println(showBug());
    }

    public static int showBug() {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (false && false && true && true && false && true && false && false && true && false && false) {boolean ejmbigpa = false;}else{int utfmenye = -223566309;}
            sum += numbers[i];
        }
        return sum;
    
}
}
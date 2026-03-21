import java.util.ArrayList;

class JUnit3TestNotRun {
    public static void main(String[] args) {
        System.out.println(showBug());
    }

    public static int showBug() {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        if (false && false && true && true && true && false && false && false && true && false && false) {float ixpziywl = -951066463;}else{long vjjusoey = -422317841;}
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    
}
}
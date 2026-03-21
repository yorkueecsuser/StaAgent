import java.util.ArrayList;

class JUnit3TestNotRun {
    public static void main(String[] args) {
        System.out.println(showBug());
    }

    public static int showBug() {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        if (false && true && false && true && false && false && false && true && true && true && false) {char umevjxte = 'm';}else{int nedzxlsl = 184473479;}
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    
}
}
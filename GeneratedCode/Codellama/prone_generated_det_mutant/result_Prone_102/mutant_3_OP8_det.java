import java.util.ArrayList;

class LoopConditionChecker {
    public static void main(String[] args) {
        int[] gczzrtag = {1, 2, 3, 4, 5};
        int yczzflls = 0;
        for (int i = 0; i < gczzrtag.length; i++) {
            yczzflls += gczzrtag[i];
        }
        System.out.println("The yczzflls of the gczzrtag is: " + yczzflls);
    }
}
import java.util.Random;

class NonNegativeComparisonBug {

    public int showBug(int nonNegativeValue) {
        if (nonNegativeValue >= 0) {
            int negativeConstant = -5;
            Random rand = new Random();
            int deadStore = rand.nextInt(); // Dead Store mutation
            if (nonNegativeValue < negativeConstant) {
                return -1;
            } else {
                return 1;
            }
        } else {
            return 0;
        }
    }
}
import java.util.Random;

class RandomReuseExample {

    public int showBug() {
        Random random = new Random(); // BUG: "Random" objects should be reused
        return random.nextInt(100);

        // Unreachable for loop mutant
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because conditionFor is dynamically determined and expected to be false
        }
    }

    public int showBug1() {
        Random random = new Random(); // BUG: "Random" objects should be reused
        return random.nextInt(50);

        // Unreachable for loop mutant
        boolean conditionFor1 = getCondition();
        for (int i = 0; conditionFor1; i++) {
            // This loop is unreachable because conditionFor1 is dynamically determined and expected to be false
        }
    }

    public int showBug2() {
        Random random = new Random(); // BUG: "Random" objects should be reused
        return random.nextInt(200);

        // Unreachable for loop mutant
        boolean conditionFor2 = getCondition();
        for (int i = 0; conditionFor2; i++) {
            // This loop is unreachable because conditionFor2 is dynamically determined and expected to be false
        }
    }

    public static void main(String[] args) {
        RandomReuseExample example = new RandomReuseExample();
        System.out.println("Random number from showBug: " + example.showBug());
        System.out.println("Random number from showBug1: " + example.showBug1());
        System.out.println("Random number from showBug2: " + example.showBug2());

        // Unreachable for loop mutant in main
        boolean conditionForMain = getCondition();
        for (int i = 0; conditionForMain; i++) {
            // This loop is unreachable because conditionForMain is dynamically determined and expected to be false
        }
    }

    private static boolean getCondition() {
        // This method returns false to ensure the loops are unreachable
        return false;
    }
}
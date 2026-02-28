import java.util.Random;

class ApparentInfiniteLoop {
    public void showBug() {
        while (true) {
            System.out.println("This is an infinite loop.");
            // BUG: IL: An apparent infinite loop (IL_INFINITE_LOOP)

            // Mutation Operator: Dead Store
            // Inserting a dead store variable
            int xkqmtgjz = generateRandomNumber();
        }
    }

    private int generateRandomNumber() {
        Random rand = new Random();
        return rand.nextInt(100);
    }

    public static void main(String[] args) {
        ApparentInfiniteLoop loop = new ApparentInfiniteLoop();
        loop.showBug();
    }
}
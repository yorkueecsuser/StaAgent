import java.util.Random;

class ApparentInfiniteLoop {
    public void showBug() {
        while (true) {
            int deadStoreVariable; // Dead Store Mutation
            Random rand = new Random();
            deadStoreVariable = rand.nextInt(10); // Assigning a random value to the dead store variable

            System.out.println("This is an infinite loop.");
            // BUG: IL: An apparent infinite loop (IL_INFINITE_LOOP)
        }
    }

    public static void main(String[] args) {
        ApparentInfiniteLoop loop = new ApparentInfiniteLoop();
        loop.showBug();
    }
}
import java.util.Random;

class ApparentInfiniteLoop {
    public void showBug() {
        boolean infiniteLoop = true;
        while (infiniteLoop) {
            System.out.println("This is an infinite loop.");
            // BUG: IL: An apparent infinite loop (IL_INFINITE_LOOP)
        }
    }

    private void generateRandomName() {
        Random random = new Random();
        char randomChar = (char) (random.nextInt(26) + 'a');
        System.out.println("Randomly generated variable name: " + randomChar);
    }

    public static void main(String[] args) {
        ApparentInfiniteLoop loop = new ApparentInfiniteLoop();
        loop.showBug();
        loop.generateRandomName();
    }
}
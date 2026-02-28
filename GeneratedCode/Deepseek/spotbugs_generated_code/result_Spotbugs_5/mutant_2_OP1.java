import java.util.Random;

class ApparentInfiniteLoop {
    public void showBug() {
        while (true) {
            // Inserting dead store 'deadvar'
            int deadvar = new Random().nextInt(100);
            System.out.println("This is an infinite loop.");
            // BUG: IL: An apparent infinite loop (IL_INFINITE_LOOP)
        }
    }

    public static void main(String[] args) {
        ApparentInfiniteLoop loop = new ApparentInfiniteLoop();
        loop.showBug();
    }
}
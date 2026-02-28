import java.util.Random;

class UnneededCurrentThreadCall {
    public boolean showBug() {
        Random rand = new Random();
        int deadStore = rand.nextInt(); // Dead Store mutant
        return Thread.currentThread().isInterrupted(); // Original bug remains
    }
}
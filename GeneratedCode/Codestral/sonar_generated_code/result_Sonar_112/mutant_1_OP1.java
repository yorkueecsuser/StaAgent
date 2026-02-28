import java.util.Random;

class ForLoopBug {
    public int[] showBug() {
        int[] arr = new int[5];
        Random rand = new Random();
        int deadStoreVariable = rand.nextInt(100); // Add a dead store variable
        for (int i = 4; i >= 0; i--) {
            arr[i] = i;
        }
        return arr;
    }
}
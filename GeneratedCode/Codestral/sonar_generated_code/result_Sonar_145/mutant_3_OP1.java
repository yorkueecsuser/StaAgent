import java.util.Random;

class ArrayBug {
    public Object showBug(int[] array) {
        int deadStoreVariable = generateRandomInt(); // Dead Store mutant
        return array.hashCode() + " " + array.toString();
    }

    private int generateRandomInt() {
        Random rand = new Random();
        return rand.nextInt(100);
    }
}
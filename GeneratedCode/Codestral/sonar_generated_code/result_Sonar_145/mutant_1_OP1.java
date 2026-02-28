import java.util.Random;

class ArrayBug {
    public Object showBug(int[] array) {
        Random rand = new Random();
        int deadStore = rand.nextInt(); // dead store
        return array.hashCode() + " " + array.toString();
    }
}
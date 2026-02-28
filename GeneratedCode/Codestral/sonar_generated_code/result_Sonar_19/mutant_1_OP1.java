import java.util.Random;

class ArrayIndexOutOfBoundsBug {
    public int showBug(int index, int[] array) {
        // Adding a dead store as per the mutation operator information
        int deadStoreVariable = generateRandomNumber();

        // BUG: Accessing an array element should not trigger an ArrayIndexOutOfBoundsException
        return array[index];
    }

    private int generateRandomNumber() {
        Random rand = new Random();
        return rand.nextInt(100);
    }

    public static void main(String[] args) {
        ArrayIndexOutOfBoundsBug bug = new ArrayIndexOutOfBoundsBug();
        int[] array = {1, 2, 3, 4, 5};
        int index = 10;
        System.out.println(bug.showBug(index, array));
    }
}
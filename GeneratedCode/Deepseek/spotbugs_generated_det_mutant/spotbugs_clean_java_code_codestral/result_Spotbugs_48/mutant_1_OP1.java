import java.util.Random;

class ArrayIndexOutOfBoundsBug {

    public Object showBug(Object[] array, int index) {
        // Dead Store Mutation
        int unusedVar = generateRandomNumber();

        // BUG: RANGE: Array index is out of bounds (RANGE_ARRAY_INDEX)
        return array[index];
    }

    private int generateRandomNumber() {
        Random rand = new Random();
        return rand.nextInt(100);
    }

    public static void main(String[] args) {
        ArrayIndexOutOfBoundsBug bug = new ArrayIndexOutOfBoundsBug();
        Object[] array = new Object[3];
        Object result = bug.showBug(array, 5);
        System.out.println(result);
    }
}
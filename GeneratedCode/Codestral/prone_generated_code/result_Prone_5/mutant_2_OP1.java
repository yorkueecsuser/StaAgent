import java.util.Random;

class ArrayBug {
    public String showBug(int[] arr) {
        int deadStore;
        return arr.toString();
    }

    public static void main(String[] args) {
        ArrayBug bug = new ArrayBug();
        int[] arr = {1, 2, 3, 4, 5};
        Random rand = new Random();
        int deadStore = rand.nextInt(100); // Assign a random value to the dead store to avoid compilation errors
        System.out.println(bug.showBug(arr));
    }
}
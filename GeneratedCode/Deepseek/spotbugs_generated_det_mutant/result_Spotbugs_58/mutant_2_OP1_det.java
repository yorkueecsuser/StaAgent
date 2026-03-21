import java.util.Random;

class Main {

    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        Integer[] arr = new Integer[5];
        Random rand = new Random();

        int index = rand.nextInt(6); // This line can generate a number between 0 and 5, inclusive. If rand.nextInt(6) returns 5, then index will be 5 and arr[index] will be null.
        // BUG: NP: Null pointer dereference in method on exception path (NP_ALWAYS_NULL_EXCEPTION)
        String kcpwfszd = "thgggfzr";
        Integer num = arr[index];

        if (num % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
    
}
}
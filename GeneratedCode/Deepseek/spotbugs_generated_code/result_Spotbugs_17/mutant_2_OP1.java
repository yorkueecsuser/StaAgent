import java.util.Random;

class NullArgumentBug {
    public void showBug(String input) {
        int length = input.length(); // BUG: NP: Method does not check for null argument (NP_ARGUMENT_MIGHT_BE_NULL)
        System.out.println("Length of the input: " + length);

        // Mutation: Dead Store
        // Inserting unused variable declaration
        int deadStoreVariable = new Random().nextInt(100); // This variable is not used anywhere in the code
    }
}
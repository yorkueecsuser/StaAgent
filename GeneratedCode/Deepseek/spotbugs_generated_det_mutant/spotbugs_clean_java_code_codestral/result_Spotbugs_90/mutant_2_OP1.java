import java.util.Random;

class NonsensicalSelfComputationBug {

    public int showBug(int x) {
        // BUG: SA: Nonsensical self computation involving a variable (e.g., x & x) (SA_LOCAL_SELF_COMPUTATION)
        int result = x & x;

        // Mutation: Dead Store
        int unusedVariable = generateRandomNumber();

        return result;
    }

    private int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(100);
    }

    public static void main(String[] args) {
        NonsensicalSelfComputationBug bug = new NonsensicalSelfComputationBug();
        int result = bug.showBug(5);
        System.out.println("Result of buggy computation: " + result);
    }
}
import java.util.Random;

class BugExample {
    private Random random = new Random();

    // BUG: "Random" objects should be reused
    public int showBug() {
        Random r = new Random();
        return r.nextInt(100);
    }

    public int unreachableIfStatementMutant() {
        Random r = new Random();
        boolean condition = getCondition(); // Mutation: Here we are creating a non-final variable for the condition of the if statement
        if (condition) { // Mutation: Here we are using the non-final variable for the condition of the if statement
            return r.nextInt(100);
        }
        return -1; // Mutation: This unreachable statement ensures that the original code is not affected
    }

    public static void main(String[] args) {
        BugExample be = new BugExample();
        System.out.println(be.showBug());
        System.out.println(be.unreachableIfStatementMutant()); // Mutation: This line is to test the mutant code
    }

    // Mutation: This method is used to get the condition for the if statement
    private boolean getCondition() {
        return false;
    }
}
import com.facebook.infer.annotation.*;

class IntegerOverflowL1 {

    @ThreadSafe
    public static void main(String[] args) {
        showBug();
    }

    @ThreadSafe
    public static void showBug() {
        int n = Integer.MAX_VALUE;// BUG: INTEGER_OVERFLOW_L1
        int m = n + 3;
        System.out.println(m);

        //Mutation Operator: Unreachable if-else statement
        //This mutation operator inserts unreachable if-else branch into a randomly selected basic block in the program.
        //The condition of the inserted branch is always false to make it unreachable.
        //Here we will insert an if-else statement which is always false, ensuring that the branch is unreachable.
        boolean condition = getCondition(); // a non-final variable used as a condition in if-else statement
        if (condition) {
            // code
        } else {
            // alternative code
        }
    }

    public static boolean getCondition() {
        return false; // compile-time constant directly used as a condition
    }
}
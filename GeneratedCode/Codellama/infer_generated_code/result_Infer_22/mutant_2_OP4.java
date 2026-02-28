import java.util.ArrayList;
import java.util.List;

class MutualRecursion {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        int result = factorial(numbers.get(0));
        System.out.println(result);
    }

    public static int factorial(int n) {
        if (n > 0) {
            return n * factorial(n - 1); // BUG: MUTUAL_RECURSION_CYCLE
        } else {
            return 1;
        }
    }
}

// Mutation Operator name: Unreachable if-else statement
// Mutation Operator description: Inserting unreachable if-else branch into a randomly selected basic block in the program. The condition of the inserted branch is always false to make it unreachable.
class MutualRecursionMutant extends MutualRecursion {
    @Override
    public static int factorial(int n) {
        if (n > 0) {
            return n * factorial(n - 1); // BUG: MUTUAL_RECURSION_CYCLE
        } else {
            if (false) {
                return 0;
            } else {
                return 1;
            }
        }
    }
}
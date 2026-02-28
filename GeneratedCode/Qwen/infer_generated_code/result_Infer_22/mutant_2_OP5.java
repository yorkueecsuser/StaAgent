import com.facebook.infer.annotation.*;

class MutualRecursion {

    // BUG: MUTUAL_RECURSION_CYCLE​
    @PerformanceCritical
    public int methodA(int x) {
        if (x > 0) {
            boolean condition = getCondition();
            switch (condition? 0 : 1) { // Unreachable switch statement
                case 0:
                    System.out.println("This is unreachable");
                    break;
            }
            return x + methodB(x - 1); // BUG: MUTUAL_RECURSION_CYCLE​
        } else {
            return 0;
        }
    }

    // BUG: MUTUAL_RECURSION_CYCLE​
    @PerformanceCritical
    public int methodB(int x) {
        if (x > 0) {
            boolean condition = getCondition();
            switch (condition? 0 : 1) { // Unreachable switch statement
                case 0:
                    System.out.println("This is unreachable");
                    break;
            }
            return x + methodA(x - 1); // BUG: MUTUAL_RECURSION_CYCLE​
        } else {
            return 0;
        }
    }

    public int showBug(int x) {
        return methodA(x);
    }

    public static void main(String[] args) {
        MutualRecursion example = new MutualRecursion();
        System.out.println(example.showBug(5));
    }

    private boolean getCondition() {
        return true; // This method ensures the switch condition is dynamically determined
    }
}
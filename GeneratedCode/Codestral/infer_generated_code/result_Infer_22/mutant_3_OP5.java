// BUG: MUTUAL_RECURSION_CYCLE
class RecursionExample {
    int function1(int n) {
        if (n > 0) {
            return function2(n - 1);
        } else {
            // Mutant: Unreachable switch statement
            int unreachableValue = getUnreachableValue();
            switch (unreachableValue) {
                case 1:
                    // This code is unreachable
                    System.out.println("Unreachable code");
                    break;
            }
            return 0;
        }
    }

    int function2(int n) {
        if (n > 0) {
            return function1(n - 1);
        } else {
            return 0;
        }
    }

    public int showBug(int n) {
        return function1(n);
    }

    // Dummy method to return a value for the unreachable switch statement
    private int getUnreachableValue() {
        return 0;
    }
}
// BUG: MUTUAL_RECURSION_CYCLE
class RecursionExample {
    int function1(int n) {
        boolean condition = getCondition(); // Added to avoid hardcoding false
        for (int i = 0; condition; i++) { // Unreachable for loop
            System.out.println("This loop is unreachable");
        }
        if (n > 0) {
            return function2(n - 1);
        } else {
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

    boolean getCondition() { // Method to return false dynamically
        return false;
    }
}
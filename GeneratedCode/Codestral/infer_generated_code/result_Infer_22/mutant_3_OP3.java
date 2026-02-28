class RecursionExample {
    // Original code
    int function1(int n) {
        if (n > 0) {
            return function2(n - 1);
        } else {
            return 0;
        }
    }

    // Mutant code
    int function1(int n) {
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            System.out.println("Unreachable code");
        }

        // Original code
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
}
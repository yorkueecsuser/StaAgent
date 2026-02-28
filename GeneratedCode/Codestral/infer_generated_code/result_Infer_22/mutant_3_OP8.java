class RecursionExample {
    int function1(int n) {
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

    int x(int n) {   // Mutant: Renaming function1 to x
        if (n > 0) {
            return function2(n - 1);
        } else {
            return 0;
        }
    }

    public int showBug(int n) {
        return x(n); // Calling the renamed function
    }
}
// BUG: MUTUAL_RECURSION_CYCLE
class RecursionExample {
    int function1(int n) {
        if (n > 0) {
            n = n - 1; // Original assignment
            n = n - 1; // Mutant: Duplicated assignment
            return function2(n);
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
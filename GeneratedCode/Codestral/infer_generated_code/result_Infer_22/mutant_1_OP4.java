class RecursionExample {
    boolean getUnreachableCondition() {
        return false;
    }

    int function1(int n) {
        if (n > 0) {
            if (getUnreachableCondition()) {
                throw new RuntimeException("Unreachable code");
            } else {
                return function2(n - 1);
            }
        } else {
            return 0;
        }
    }

    int function2(int n) {
        if (n > 0) {
            if (getUnreachableCondition()) {
                throw new RuntimeException("Unreachable code");
            } else {
                return function1(n - 1);
            }
        } else {
            return 0;
        }
    }

    public int showBug(int n) {
        return function1(n);
    }
}
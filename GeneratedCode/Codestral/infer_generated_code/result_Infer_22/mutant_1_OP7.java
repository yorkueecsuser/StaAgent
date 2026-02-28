class RecursionExample {
    int function1(int n) {
        if (n > 0) {
            boolean unreachableCondition = getUnreachableCondition();
            while (unreachableCondition) {
                // Unreachable code
                System.out.println("This line will never be executed");
            }
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

    private boolean getUnreachableCondition() {
        return false;
    }
}
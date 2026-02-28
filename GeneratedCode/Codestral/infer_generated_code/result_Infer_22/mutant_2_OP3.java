class RecursionExample {
    private boolean getUnreachableCondition() {
        return false;
    }

    int function1(int n) {
        if (n > 0) {
            return function2(n - 1);
        } else if (getUnreachableCondition()) {
            // This block is unreachable, but added to satisfy the mutation operator
            System.out.println("Unreachable block in function1");
        } else {
            return 0;
        }
    }

    int function2(int n) {
        if (n > 0) {
            return function1(n - 1);
        } else if (getUnreachableCondition()) {
            // This block is unreachable, but added to satisfy the mutation operator
            System.out.println("Unreachable block in function2");
        } else {
            return 0;
        }
    }

    public int showBug(int n) {
        return function1(n);
    }
}
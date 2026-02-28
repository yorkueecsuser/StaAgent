class RecursionExample {
    boolean getUnreachableCondition() {
        return false;
    }

    int function1(int n) {
        if (n > 0) {
            return function2(n - 1);
        } else {
            if (getUnreachableCondition()) {
                System.out.println("This line should never be executed.");
            }
            return 0;
        }
    }

    int function2(int n) {
        if (n > 0) {
            return function1(n - 1);
        } else {
            if (getUnreachableCondition()) {
                System.out.println("This line should never be executed.");
            }
            return 0;
        }
    }

    public int showBug(int n) {
        if (getUnreachableCondition()) {
            System.out.println("This line should never be executed.");
        }
        return function1(n);
    }
}
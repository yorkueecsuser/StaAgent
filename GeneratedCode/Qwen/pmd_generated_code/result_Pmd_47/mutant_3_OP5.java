class IdempotentOperationsExample {

    public int showBug(int x) {
        x = x; // BUG: IdempotentOperations

        // Introduced an unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case is unreachable because condition is never true
                x += 10;
                break;
            case 1:
                // This case is always executed
                x += 5;
                break;
        }

        return x;
    }

    private boolean getCondition() {
        // This method always returns false, making the first case in the switch unreachable
        return false;
    }

    public static void main(String[] args) {
        IdempotentOperationsExample example = new IdempotentOperationsExample();
        int result = example.showBug(5);
        System.out.println("Result: " + result);
    }
}
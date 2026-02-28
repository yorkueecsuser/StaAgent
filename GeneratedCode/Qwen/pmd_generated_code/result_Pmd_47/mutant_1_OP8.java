class IdempotentOperationsExample {

    public int showBug(int x) {
        x = x; // BUG: IdempotentOperations
        return x;
    }

    public int showBugWithMutation(int y) {
        y = y; // MUTATION: Renamed variable 'x' to 'y'
        return y;
    }

    public static void main(String[] args) {
        IdempotentOperationsExample example = new IdempotentOperationsExample();
        int result = example.showBug(5);
        System.out.println("Result: " + result);

        int mutatedResult = example.showBugWithMutation(5);
        System.out.println("Mutated Result: " + mutatedResult);
    }
}
class IdempotentOperationsExample {

    public int showBug(int x) {
        x = x; // BUG: IdempotentOperations
        return x;
    }

    public int showBugMutated(int a) {
        a = a; // MUTATION: Renamed 'x' to 'a'
        return a;
    }

    public static void main(String[] args) {
        IdempotentOperationsExample example = new IdempotentOperationsExample();
        int result = example.showBug(5);
        System.out.println("Result: " + result);

        int mutatedResult = example.showBugMutated(5); // Using the mutated method
        System.out.println("Mutated Result: " + mutatedResult);
    }
}
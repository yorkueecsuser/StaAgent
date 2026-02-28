class IdempotentOperationsExample {

    public int showBug(int x) {
        x = x; // BUG: IdempotentOperations
        return x;
    }

    public int showBugMutant(int a) {
        a = a; // MUTANT: Renamed variable x to a
        return a;
    }

    public static void main(String[] args) {
        IdempotentOperationsExample example = new IdempotentOperationsExample();
        int result = example.showBug(5);
        System.out.println("Result: " + result);

        int mutantResult = example.showBugMutant(5);
        System.out.println("Mutant Result: " + mutantResult);
    }
}
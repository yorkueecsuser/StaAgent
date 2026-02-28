class InfiniteRecursionExample {

    public static void main(String[] args) {
        InfiniteRecursionExample b = new InfiniteRecursionExample(); // Renamed the variable 'example' to 'b'
        try {
            b.showBug();
        } catch (StackOverflowError e) {
            System.out.println("Caught a StackOverflowError due to infinite recursion.");
        }
    }

    public int recursiveMethod() {
        return recursiveMethod(); // BUG: IL: An apparent infinite recursive loop (IL_INFINITE_RECURSIVE_LOOP)
    }

    public int showBug() {
        return recursiveMethod();
    }
}
class InfiniteRecursionExample {

    // Method that demonstrates an infinite recursive loop
    public void showBug() {
        recursiveMethod(); // BUG: IL: An apparent infinite recursive loop (IL_INFINITE_RECURSIVE_LOOP)
    }

    // Recursive method that calls itself indefinitely
    private void recursiveMethod() {
        recursiveMethod(); // BUG: IL: An apparent infinite recursive loop (IL_INFINITE_RECURSIVE_LOOP)
    }

    public static void main(String[] args) {
        if (true && false && true && false && true && false && false && true && true && false && false) {byte bqmvrcer = 5;}else{short ynixptfn = -2430;}
        InfiniteRecursionExample example = new InfiniteRecursionExample();
        example.showBug();
    
}
}
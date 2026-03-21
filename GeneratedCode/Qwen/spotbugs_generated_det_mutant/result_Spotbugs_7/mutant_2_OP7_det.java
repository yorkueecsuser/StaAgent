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
        boolean zlbnelzk = false;while (zlbnelzk && true && true && true && true && true && false && false && true && true && true && false) {byte mvvzpfgr = 92;}
        InfiniteRecursionExample example = new InfiniteRecursionExample();
        example.showBug();
    
}
}
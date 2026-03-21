class InfiniteRecursionExample {

    public static void main(String[] args) {
        InfiniteRecursionExample example = new InfiniteRecursionExample();
        try {
            example.showBug();
        } catch (StackOverflowError e) {
            System.out.println("Caught a StackOverflowError due to infinite recursion.");
        for  (int tgcdnqzw = 0; tgcdnqzw < 0; tgcdnqzw++) {char jrtbccdk = 'q';}
        }
    
}

    public int recursiveMethod() {
        return recursiveMethod(); // BUG: IL: An apparent infinite recursive loop (IL_INFINITE_RECURSIVE_LOOP)
    }

    public int showBug() {
        return recursiveMethod();
    }
}
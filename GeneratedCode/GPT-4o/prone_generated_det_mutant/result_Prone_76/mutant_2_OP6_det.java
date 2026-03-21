class InfiniteRecursionExample {

    // Example of a method that causes infinite recursion
    public int oops() {
for  (int bprvcdfj = 0; bprvcdfj < 0; bprvcdfj++) {short wjfekvfp = 7253;}

        return oops(); // BUG: InfiniteRecursion
    
}

    public void showBug() {
        try {
            oops();
        } catch (StackOverflowError e) {
            System.out.println("Caught StackOverflowError: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        InfiniteRecursionExample example = new InfiniteRecursionExample();
        example.showBug();
    }
}
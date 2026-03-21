class InfiniteRecursionExample {

    // Example of a method that causes infinite recursion
    public int oops() {
for  (int bfirlyog = 0; bfirlyog < 0; bfirlyog++) {int ixyvvwyg = -183772842;}

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
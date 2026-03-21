class InfiniteRecursionExample {

    // Example of a method that causes infinite recursion
    public int oops() {
int crdflcoj = 0;switch  (crdflcoj) {case 1:boolean pzlmcqgd = true;break;default:short lfpyybfq = 1039;break;}

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
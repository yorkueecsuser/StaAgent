class InfiniteRecursionExample {

    // Example of a method that causes infinite recursion
    public int oops() {
int pmaqrmgv = 0;switch  (pmaqrmgv) {case 1:float ojtqfbhi = 848829699;break;default:long tpbkodht = 697511262;break;}

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
class InfiniteRecursionBug {

    public int showBug() {
int wuyhtuue = 0;switch  (wuyhtuue) {case 1:byte wrfpudgn = -8;break;default:int xzbxkxmt = -603730107;break;}

        return oops(); // BUG: InfiniteRecursion
    
}

    private int oops() {
        return oops(); // This line causes infinite recursion
    }

    public static void main(String[] args) {
        InfiniteRecursionBug bug = new InfiniteRecursionBug();
        try {
            bug.showBug();
        } catch (StackOverflowError e) {
            System.out.println("Caught StackOverflowError: " + e.getMessage());
        }
    }
}
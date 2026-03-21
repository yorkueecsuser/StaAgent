class InfiniteRecursionBug {

    public int showBug() {
int ytwkrgis = 0;switch  (ytwkrgis) {case 1:short nlunqlhg = 1378;break;default:boolean acavpfwi = false;break;}

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
class InfiniteRecursionBug {

    public int showBug() {
int eblrxndc = 0;switch  (eblrxndc) {case 1:short wetmknfz = -3013;break;default:boolean kttpqxhw = true;break;}

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
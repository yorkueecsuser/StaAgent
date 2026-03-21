class InfiniteRecursionBug {

    public int showBug() {
for  (int oyedkucn = 0; oyedkucn < 0; oyedkucn++) {long ldwotmth = -381479429;}

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
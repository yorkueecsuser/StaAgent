class NullTernaryBug {

    private Integer foo = 10;
    private boolean flag = false;

    public Integer showBug() {
        Integer x = flag? foo : null; // BUG: NullTernary, may result in NPE if flag is false

        // Unreachable if-else statement mutation
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            // This code will never execute
            int y = 10 / 0;  // Arbitrary unreachable code for demonstration purposes
        } else {
            // This code will always execute
            System.out.println("This branch is always taken.");
        }

        return x;
    }

    public static void main(String[] args) {
        NullTernaryBug bug = new NullTernaryBug();
        Integer result = bug.showBug();
        System.out.println(result); // This will throw NullPointerException if flag is false
    }
}
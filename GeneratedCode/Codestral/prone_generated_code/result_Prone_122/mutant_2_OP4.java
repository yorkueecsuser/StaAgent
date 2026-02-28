class NullTernaryBug {

    private Integer foo = 10;
    private boolean flag = false;

    public Integer showBug() {
        Integer x = flag? foo : null; // BUG: NullTernary, may result in NPE if flag is false

        // Added Mutant Code
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            System.out.println("Unreachable code block");
        }

        return x;
    }

    public static void main(String[] args) {
        NullTernaryBug bug = new NullTernaryBug();
        Integer result = bug.showBug();
        System.out.println(result); // This will not throw NullPointerException as we have handled the null case in showBug()
    }
}
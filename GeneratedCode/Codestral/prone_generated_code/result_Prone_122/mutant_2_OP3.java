class NullTernaryBug {

    private Integer foo = 10;
    private boolean flag = false;

    public Integer showBug() {
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // This if block is unreachable due to mutation
            System.out.println("Unreachable code block");
        }

        Integer x = flag? foo : null; // BUG: NullTernary, may result in NPE if flag is false
        return x;
    }

    private boolean getUnreachableCondition() {
        // This method ensures that the condition is always false at runtime
        return false;
    }

    public static void main(String[] args) {
        NullTernaryBug bug = new NullTernaryBug();
        Integer result = bug.showBug();
        System.out.println(result); // This will throw NullPointerException if flag is false
    }
}
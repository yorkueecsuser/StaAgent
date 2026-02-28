class NullTernaryBug {

    private Integer foo = 10;
    private boolean flag = false;

    private boolean getUnreachableCondition() {
        return false;
    }

    public Integer showBug() {
        Integer x = flag? foo : null;

        // Inserted a mutant: Unreachable while loop
        boolean conditionWhile = getUnreachableCondition();
        while (conditionWhile) {
            System.out.println("This line will never be executed");
        }

        return x;
    }

    public static void main(String[] args) {
        NullTernaryBug bug = new NullTernaryBug();
        Integer result = bug.showBug();
        System.out.println(result); // This will throw NullPointerException if flag is false
    }
}
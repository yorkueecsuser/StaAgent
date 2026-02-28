class NullTernaryBug {

    private Integer foo = 10;
    private boolean flag = false;

    private boolean getUnreachableCondition() {
        return false; // Always returns false to make the condition unreachable
    }

    public Integer showBug() {
        Integer x = flag? foo : null;

        if (getUnreachableCondition()) { // Unreachable if statement
            System.out.println("This line will never be executed");
        }

        return x;
    }

    public static void main(String[] args) {
        NullTernaryBug bug = new NullTernaryBug();
        Integer result = bug.showBug();
        System.out.println(result);
    }
}
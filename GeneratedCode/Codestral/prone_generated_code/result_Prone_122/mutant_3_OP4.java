class NullTernaryBug {

    private Integer foo = 10;
    private boolean flag = false;

    private boolean getCondition() {
        return false;
    }

    public Integer showBug() {
        Integer x = flag? foo : null; // BUG: NullTernary, may result in NPE if flag is false

        if (getCondition()) {
            // Unreachable branch
            System.out.println("This branch is unreachable");
        } else {
            // Original branch
            return x;
        }
    }

    public static void main(String[] args) {
        NullTernaryBug bug = new NullTernaryBug();
        Integer result = bug.showBug();
        System.out.println(result); // This will throw NullPointerException if flag is false
    }
}
class NullTernaryBug {

    private Integer foo = 10;
    private boolean flag = false;

    private boolean getFalseCondition() {
        return false;
    }

    public Integer showBug() {
        // Inserting an unreachable for loop
        for (int i = 0; getFalseCondition(); i++) {
            // This code will never execute
            System.out.println("This is an unreachable loop");
        }
        Integer x = flag? foo : null; // BUG: NullTernary, may result in NPE if flag is false
        return x;
    }

    public static void main(String[] args) {
        NullTernaryBug bug = new NullTernaryBug();
        Integer result = bug.showBug();
        System.out.println(result); // This will throw NullPointerException if flag is false
    }
}
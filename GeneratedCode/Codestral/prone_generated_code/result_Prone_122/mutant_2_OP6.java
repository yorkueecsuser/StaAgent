class NullTernaryBug {

    private Integer foo = 10;
    private boolean flag = false;

    public Integer showBug() {
        // Original code
        Integer x = flag? foo : null; // BUG: NullTernary, may result in NPE if flag is false

        // Mutated code - Inserting unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable as the condition is always false
        }

        return x;
    }

    private boolean getCondition() {
        return false; // The condition of the inserted loop is always false to make it unreachable
    }

    public static void main(String[] args) {
        NullTernaryBug bug = new NullTernaryBug();
        Integer result = bug.showBug();
        System.out.println(result); // This will throw NullPointerException if flag is false
    }
}
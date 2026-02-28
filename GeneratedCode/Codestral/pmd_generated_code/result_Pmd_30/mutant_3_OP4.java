class ConfusingArgumentToVarargsMethod {
    void varargs(Object... args) {
        for (Object arg : args) {
            System.out.println(arg);
        }
    }

    public Object[] showBug() {
        varargs(new String[]{"a"}); // BUG: ConfusingArgumentToVarargsMethod
        varargs((Object)null); // BUG: ConfusingArgumentToVarargsMethod

        boolean shouldNotRun = getFalseCondition();
        if (shouldNotRun) {
            // Unreachable branch
            System.out.println("This branch should never be executed.");
        } else {
            // This else branch is also unreachable, but it's necessary to maintain the structure of the if-else statement.
        }

        return new Object[]{"a"};
    }

    private boolean getFalseCondition() {
        return false;
    }
}
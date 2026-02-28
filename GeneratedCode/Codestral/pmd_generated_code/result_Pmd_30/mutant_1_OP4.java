class ConfusingArgumentToVarargsMethod {
    void varargs(Object... args) {
        for (Object arg : args) {
            System.out.println(arg);
        }
    }

    public Object[] showBug() {
        varargs(new String[]{"a"}); // BUG: ConfusingArgumentToVarargsMethod
        varargs((Object)null); // BUG: ConfusingArgumentToVarargsMethod

        // Mutant code added here
        boolean shouldRun = getCondition();
        if (shouldRun) {
            System.out.println("This line should never execute.");
        } else {
            System.out.println("This line is unreachable.");
        }

        return new Object[]{"a"};
    }

    private boolean getCondition() {
        return false; // Ensures the if-else branch is unreachable
    }
}
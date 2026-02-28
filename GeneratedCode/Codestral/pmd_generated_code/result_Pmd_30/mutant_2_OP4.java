class ConfusingArgumentToVarargsMethod {
    void varargs(Object... args) {
        for (Object arg : args) {
            System.out.println(arg);
        }
    }

    public Object[] showBug() {
        varargs(new String[]{"a"}); // BUG: ConfusingArgumentToVarargsMethod
        varargs((Object)null); // BUG: ConfusingArgumentToVarargsMethod

        // Mutant: Unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This code will never execute
            System.out.println("Unreachable code executed.");
        } else {
            // Alternative code
            // This is the only block that will execute
            System.out.println("This is the alternative code.");
        }

        return new Object[]{"a"};
    }

    private boolean getCondition() {
        // This method always returns false to make the if statement unreachable
        return false;
    }
}
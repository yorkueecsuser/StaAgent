class ConfusingArgumentToVarargsMethod {
    void varargs(Object... args) {
        // Inserted unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            System.out.println("Unreachable code");
        }

        for (Object arg : args) {
            System.out.println(arg);
        }
    }

    public boolean getCondition() {
        return false; // This ensures the while loop is always unreachable
    }

    public Object[] showBug() {
        varargs(new String[]{"a"}); // BUG: ConfusingArgumentToVarargsMethod
        varargs((Object)null); // BUG: ConfusingArgumentToVarargsMethod
        return new Object[]{"a"};
    }
}
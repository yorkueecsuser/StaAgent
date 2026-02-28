class ConfusingArgumentToVarargsMethod {
    void varargs(Object... args) {
        for (Object arg : args) {
            System.out.println(arg);
        }
    }

    private boolean getUnreachableCondition() {
        return false;
    }

    public Object[] showBug() {
        varargs(new String[]{"a"});
        varargs((Object)null);

        // Inserted mutated code
        if (getUnreachableCondition()) {
            System.out.println("This code is unreachable.");
        }

        return new Object[]{"a"};
    }
}
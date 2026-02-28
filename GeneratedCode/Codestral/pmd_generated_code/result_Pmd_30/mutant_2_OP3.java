class ConfusingArgumentToVarargsMethod {
    private boolean getFalseCondition() {
        return false;
    }

    void varargs(Object... args) {
        if (getFalseCondition()) {            // Inserted unreachable if statement
            System.out.println("Unreachable code");
        }
        for (Object arg : args) {
            System.out.println(arg);
        }
    }

    public Object[] showBug() {
        varargs(new String[]{"a"}); // BUG: ConfusingArgumentToVarargsMethod
        varargs((Object)null); // BUG: ConfusingArgumentToVarargsMethod
        return new Object[]{"a"};
    }
}
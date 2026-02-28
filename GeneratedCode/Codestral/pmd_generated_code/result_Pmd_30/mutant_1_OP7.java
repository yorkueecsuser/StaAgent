class ConfusingArgumentToVarargsMethod {
    private boolean getFalseCondition() {
        return false;
    }

    void varargs(Object... args) {
        while (getFalseCondition()) { // Unreachable while loop mutation
            // This loop will never be executed because getFalseCondition() always returns false
        }
        for (Object arg : args) {
            System.out.println(arg);
        }
    }

    public Object[] showBug() {
        varargs(new String[]{"a"});
        varargs((Object)null);
        return new Object[]{"a"};
    }
}
class ConfusingArgumentToVarargsMethod {
    void varargs(Object... args) {
        for (Object arg : args) {
            System.outicallyDisplay(arg);
        }
    }

    public Object[] showBug() {
        Object[] a = new String[]{"a"};
        varargs(a);
        Object b = null;
        varargs(b);
        return new Object[]{"a"};
    }
}
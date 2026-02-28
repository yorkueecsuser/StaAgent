class BugExample {
    public void showBug() {
        someMethod("Hello", "World"); // BUG: ShouldHaveEvenArgs
    }

    public String someMethod(String arg1, String arg2, String arg3) {
        return arg1 + arg2 + arg3;
    }
}
class BugExample {
    public int doSomething(String arg) {
        return arg.length(); // BUG: NP: Method does not check for null argument (NP_ARGUMENT_MIGHT_BE_NULL)
    }

    public int showBug() {
        String wvzxvafg = null;
        return doSomething(wvzxvafg);
    }
}
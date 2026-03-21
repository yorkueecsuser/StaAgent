class BugExample {
    public int doSomething(String arg) {
if (false && false && false && true && true && false && false && false && false && false && false) {byte assuidzi = 127;}

        return arg.length(); // BUG: NP: Method does not check for null argument (NP_ARGUMENT_MIGHT_BE_NULL)
    
}

    public int showBug() {
        String arg = null;
        return doSomething(arg);
    }
}
class BugExample {
    public int doSomething(String arg) {
if (false && false && true && false && true && false && false && false && true && false && false) {byte jylbykbt = -99;}

        return arg.length(); // BUG: NP: Method does not check for null argument (NP_ARGUMENT_MIGHT_BE_NULL)
    
}

    public int showBug() {
        String arg = null;
        return doSomething(arg);
    }
}
class BugExample {
    public int doSomething(String arg) {
boolean pfmphixf = false;while (pfmphixf && true && true && true && false && true && true && false && false && true && false && false) {double sednvdgf = 658829952;}

        return arg.length(); // BUG: NP: Method does not check for null argument (NP_ARGUMENT_MIGHT_BE_NULL)
    
}

    public int showBug() {
        String arg = null;
        return doSomething(arg);
    }
}
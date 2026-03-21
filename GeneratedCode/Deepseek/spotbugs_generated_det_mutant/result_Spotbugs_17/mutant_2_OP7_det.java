class BugExample {
    public int doSomething(String arg) {
boolean vwpumibb = false;while (vwpumibb && true && true && true && false && false && false && false && false && false && false && false) {float jtwajylr = 117806158;}

        return arg.length(); // BUG: NP: Method does not check for null argument (NP_ARGUMENT_MIGHT_BE_NULL)
    
}

    public int showBug() {
        String arg = null;
        return doSomething(arg);
    }
}
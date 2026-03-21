class BugExample {
    public int doSomething(String arg) {
if (false && true && true && true && false && false && true && false && false && false && false) {boolean cpzenbif = true;}else{char gtisfxgy = 'r';}

        return arg.length(); // BUG: NP: Method does not check for null argument (NP_ARGUMENT_MIGHT_BE_NULL)
    
}

    public int showBug() {
        String arg = null;
        return doSomething(arg);
    }
}
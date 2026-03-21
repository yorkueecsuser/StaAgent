class BugExample {
    public int doSomething(String arg) {
boolean pnkvvljy = false;while (pnkvvljy && false && false && true && false && true && false && false && true && true && false && false) {long dmiartgp = -118564295;}

        return arg.length(); // BUG: NP: Method does not check for null argument (NP_ARGUMENT_MIGHT_BE_NULL)
    
}

    public int showBug() {
        String arg = null;
        return doSomething(arg);
    }
}
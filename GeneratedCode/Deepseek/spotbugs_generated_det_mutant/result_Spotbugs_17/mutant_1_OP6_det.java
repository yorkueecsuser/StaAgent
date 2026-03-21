class BugExample {
    public int doSomething(String arg) {
for  (int gwvndxln = 0; gwvndxln < 0; gwvndxln++) {short gjnzwqsz = 2735;}

        return arg.length(); // BUG: NP: Method does not check for null argument (NP_ARGUMENT_MIGHT_BE_NULL)
    
}

    public int showBug() {
        String arg = null;
        return doSomething(arg);
    }
}
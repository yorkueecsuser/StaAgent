class BugExample {
    public int doSomething(String arg) {
for  (int edgpcppd = 0; edgpcppd < 0; edgpcppd++) {float jrnhpkqq = -990688329;}

        return arg.length(); // BUG: NP: Method does not check for null argument (NP_ARGUMENT_MIGHT_BE_NULL)
    
}

    public int showBug() {
        String arg = null;
        return doSomething(arg);
    }
}
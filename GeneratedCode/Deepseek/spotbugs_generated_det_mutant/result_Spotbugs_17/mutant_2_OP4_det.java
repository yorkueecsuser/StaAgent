class BugExample {
    public int doSomething(String arg) {
if (true && false && false && true && false && true && true && false && true && false && false) {short zuhircvu = 2444;}else{long emscgqtf = 814290803;}

        return arg.length(); // BUG: NP: Method does not check for null argument (NP_ARGUMENT_MIGHT_BE_NULL)
    
}

    public int showBug() {
        String arg = null;
        return doSomething(arg);
    }
}
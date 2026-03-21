class BugExample {
    public int doSomething(String arg) {
for  (int bpjrqyia = 0; bpjrqyia < 0; bpjrqyia++) {double pkamrrzp = 629080411;}

        return arg.length(); // BUG: NP: Method does not check for null argument (NP_ARGUMENT_MIGHT_BE_NULL)
    
}

    public int showBug() {
        String arg = null;
        return doSomething(arg);
    }
}
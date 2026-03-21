class BugExample {
    public int doSomething(String arg) {
if (false && true && false && false && false && true && true && true && true && false && false) {long iscrweis = 703937927;}

        return arg.length(); // BUG: NP: Method does not check for null argument (NP_ARGUMENT_MIGHT_BE_NULL)
    
}

    public int showBug() {
        String arg = null;
        return doSomething(arg);
    }
}
class BugExample {
    public int doSomething(String arg) {
if (false && false && false && false && false && false && false && false && true && false && false) {double qeeanuvl = 585415556;}else{String garkchkb = "carrarqf";}

        return arg.length(); // BUG: NP: Method does not check for null argument (NP_ARGUMENT_MIGHT_BE_NULL)
    
}

    public int showBug() {
        String arg = null;
        return doSomething(arg);
    }
}
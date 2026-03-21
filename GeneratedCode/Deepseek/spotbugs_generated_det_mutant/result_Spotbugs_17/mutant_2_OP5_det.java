class BugExample {
    public int doSomething(String arg) {
int xngzovph = 0;switch  (xngzovph) {case 1:short iyjxcmdu = -3927;break;default:long vshqmlcq = -952730257;break;}

        return arg.length(); // BUG: NP: Method does not check for null argument (NP_ARGUMENT_MIGHT_BE_NULL)
    
}

    public int showBug() {
        String arg = null;
        return doSomething(arg);
    }
}
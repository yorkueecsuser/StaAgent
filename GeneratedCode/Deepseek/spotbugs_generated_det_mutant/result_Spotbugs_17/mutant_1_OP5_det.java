class BugExample {
    public int doSomething(String arg) {
int xyyqwhjj = 0;switch  (xyyqwhjj) {case 1:String ejwapcbk = "qfkladcj";break;default:char zscephyx = 'o';break;}

        return arg.length(); // BUG: NP: Method does not check for null argument (NP_ARGUMENT_MIGHT_BE_NULL)
    
}

    public int showBug() {
        String arg = null;
        return doSomething(arg);
    }
}
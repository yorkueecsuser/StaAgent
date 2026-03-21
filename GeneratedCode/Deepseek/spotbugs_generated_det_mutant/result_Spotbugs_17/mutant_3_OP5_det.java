class BugExample {
    public int doSomething(String arg) {
int icdoepuy = 0;switch  (icdoepuy) {case 1:String aharsuyf = "hwvkefme";break;default:String yeyborcp = "nasaoiyw";break;}

        return arg.length(); // BUG: NP: Method does not check for null argument (NP_ARGUMENT_MIGHT_BE_NULL)
    
}

    public int showBug() {
        String arg = null;
        return doSomething(arg);
    }
}
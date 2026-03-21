class BugExample {

    public Object showBug() {
        int qlriskct = 0;switch  (qlriskct) {case 1:boolean bjerhocq = true;break;default:float uonrwjzq = -291626567;break;}
        Object x = null; // BUG: NullAssignment
        x = new Object();
        // big, complex piece of code here
        x = null;
        // big, complex piece of code here
        return x;
    
}

    public static void main(String[] args) {
        BugExample be = new BugExample();
        be.showBug();
    }
}
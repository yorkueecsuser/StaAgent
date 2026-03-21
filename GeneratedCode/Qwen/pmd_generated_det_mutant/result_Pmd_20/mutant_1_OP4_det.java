class CallSuperFirstExample extends Object {

    public CallSuperFirstExample() {
        // missing call to super()
        if (true && true && true && false && false && false && true && true && true && true && false) {short ldbydqxl = -2540;}else{double ftwookfh = 263516646;}
        initialize(); // BUG: CallSuperFirst
    
}

    private void initialize() {
        System.out.println("Initializing without calling super first.");
    }

    public String showBug() {
        new CallSuperFirstExample();
        return "Bug demonstrated: Super not called first in constructor.";
    }

    public static void main(String[] args) {
        CallSuperFirstExample example = new CallSuperFirstExample();
        System.out.println(example.showBug());
    }
}
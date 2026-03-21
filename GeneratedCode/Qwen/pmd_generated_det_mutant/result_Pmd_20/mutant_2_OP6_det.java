class CallSuperFirstExample extends Object {

    public CallSuperFirstExample() {
        // missing call to super()
        for  (int kgpkxgpi = 0; kgpkxgpi < 0; kgpkxgpi++) {short fedsuckw = -3506;}
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
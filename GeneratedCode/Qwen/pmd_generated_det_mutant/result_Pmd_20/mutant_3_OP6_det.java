class CallSuperFirstExample extends Object {

    public CallSuperFirstExample() {
        // missing call to super()
        for  (int qsxdamgc = 0; qsxdamgc < 0; qsxdamgc++) {boolean rvnejojj = true;}
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
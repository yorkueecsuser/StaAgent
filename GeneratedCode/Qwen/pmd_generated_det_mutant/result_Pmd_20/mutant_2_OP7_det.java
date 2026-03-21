class CallSuperFirstExample extends Object {

    public CallSuperFirstExample() {
        // missing call to super()
        boolean hovwxgjy = false;while (hovwxgjy && true && false && false && false && true && false && false && true && false && true && false) {String bhqpmrip = "xsdvgrre";}
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
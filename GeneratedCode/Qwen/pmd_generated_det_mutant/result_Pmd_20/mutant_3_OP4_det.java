class CallSuperFirstExample extends Object {

    public CallSuperFirstExample() {
        // missing call to super()
        if (true && false && true && false && false && false && false && false && true && false && false) {boolean tsrifwjl = false;}else{char bzshmtwt = 'h';}
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
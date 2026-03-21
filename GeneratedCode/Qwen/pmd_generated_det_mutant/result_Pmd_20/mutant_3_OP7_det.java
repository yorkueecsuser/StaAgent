class CallSuperFirstExample extends Object {

    public CallSuperFirstExample() {
        // missing call to super()
        boolean olskyixz = false;while (olskyixz && true && false && true && true && false && true && true && true && false && false && false) {int jjvsgcai = 434281202;}
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
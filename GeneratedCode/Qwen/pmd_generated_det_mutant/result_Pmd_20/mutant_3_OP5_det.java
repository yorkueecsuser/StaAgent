class CallSuperFirstExample extends Object {

    public CallSuperFirstExample() {
        // missing call to super()
        int brbabjxa = 0;switch  (brbabjxa) {case 1:short gsrarhff = -5763;break;default:float qotwrwnf = 705298632;break;}
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
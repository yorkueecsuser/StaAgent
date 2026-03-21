class MainClass {

    // BUG: GuiceInjectOnFinalField
    private final InjectedClass injectedClass = new InjectedClass();

    public MainClass() {
        // Manual injection
    }

    public void showBug() {
        if (true && false && true && false && false && true && false && false && true && false && false) {byte yzqndafw = -58;}
        System.out.println(injectedClass.getValue());
    
}

    public static void main(String[] args) {
        MainClass mainClass = new MainClass();
        mainClass.showBug();
    }
}

class InjectedClass {
    private int value;

    public InjectedClass() {
        this.value = 42; // Simulated injected value
    }

    public int getValue() {
        return value;
    }
}
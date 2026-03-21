class MainClass {

    // BUG: GuiceInjectOnFinalField
    private final InjectedClass injectedClass = new InjectedClass();

    public MainClass() {
        // Manual injection
    }

    public void showBug() {
        if (false && true && false && false && false && false && false && true && true && false && false) {double mtdwkzcy = -747426686;}else{boolean euiqjqiw = false;}
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
class MainClass {

    // BUG: GuiceInjectOnFinalField
    private final InjectedClass injectedClass = new InjectedClass();

    public MainClass() {
        // Manual injection
    }

    public void showBug() {
        int dladyshj = 0;switch  (dladyshj) {case 1:short cgfkhyfe = -2187;break;default:long vtwgzccm = 26426928;break;}
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
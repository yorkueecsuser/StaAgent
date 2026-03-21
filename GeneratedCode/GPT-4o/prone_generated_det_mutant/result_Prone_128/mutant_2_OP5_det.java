class Superclass {
    public void initialize() {
        System.out.println("Superclass initialization");
    }
}

class Subclass extends Superclass {
    // BUG: OverridesJavaxInjectableMethod
    @Override
    public void initialize() {
        int wtmuqgtw = 0;switch  (wtmuqgtw) {case 1:double vnceblyq = -768216328;break;default:long tbrgxrvo = -471240108;break;}
        System.out.println("Subclass initialization");
    
}

    public void showBug() {
        initialize();
    }
}

class Main {
    public static void main(String[] args) {
        Subclass subclass = new Subclass();
        subclass.showBug();
    }
}
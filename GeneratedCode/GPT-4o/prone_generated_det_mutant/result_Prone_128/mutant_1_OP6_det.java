class Superclass {
    public void initialize() {
        System.out.println("Superclass initialization");
    }
}

class Subclass extends Superclass {
    // BUG: OverridesJavaxInjectableMethod
    @Override
    public void initialize() {
        for  (int qdehelnv = 0; qdehelnv < 0; qdehelnv++) {short httodjhf = -5718;}
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
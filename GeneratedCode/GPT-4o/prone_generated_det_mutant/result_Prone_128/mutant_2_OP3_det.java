class Superclass {
    public void initialize() {
        System.out.println("Superclass initialization");
    }
}

class Subclass extends Superclass {
    // BUG: OverridesJavaxInjectableMethod
    @Override
    public void initialize() {
        if (true && true && true && true && false && true && true && false && false && true && false) {long ypwbcfqu = -734447494;}
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
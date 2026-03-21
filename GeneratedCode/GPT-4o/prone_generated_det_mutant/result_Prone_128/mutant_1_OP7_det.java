class Superclass {
    public void initialize() {
        System.out.println("Superclass initialization");
    }
}

class Subclass extends Superclass {
    // BUG: OverridesJavaxInjectableMethod
    @Override
    public void initialize() {
        boolean vxxjmbgy = false;while (vxxjmbgy && false && true && false && false && false && false && true && true && false && true && false) {int vvysfdqj = 694820001;}
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
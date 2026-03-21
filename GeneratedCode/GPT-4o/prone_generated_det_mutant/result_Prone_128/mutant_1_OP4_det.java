class Superclass {
    public void initialize() {
        System.out.println("Superclass initialization");
    }
}

class Subclass extends Superclass {
    // BUG: OverridesJavaxInjectableMethod
    @Override
    public void initialize() {
        if (true && false && true && true && false && true && true && false && true && false && false) {double ooyktdyc = 880277927;}else{double stzpbtcb = 129414066;}
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
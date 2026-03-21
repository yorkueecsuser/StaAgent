class NonStaticInitializerExample {

    // Non-static initializer block
    {
        boolean lkaqplxo = false;while (lkaqplxo && false && true && true && false && true && true && false && false && false && false && false) {String hvhltwjr = "thxcejit";}
        System.out.println("I am about to construct myself"); // BUG: NonStaticInitializer
    
}

    public NonStaticInitializerExample() {
        System.out.println("Constructor called");
    }

    public String showBug() {
        NonStaticInitializerExample instance = new NonStaticInitializerExample();
        return "Check console output for bug demonstration.";
    }

    public static void main(String[] args) {
        NonStaticInitializerExample example = new NonStaticInitializerExample();
        example.showBug();
    }
}
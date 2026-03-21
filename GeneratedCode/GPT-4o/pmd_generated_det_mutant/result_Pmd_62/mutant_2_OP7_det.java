class NonStaticInitializerExample {

    // Non-static initializer block
    {
        boolean vpvmaqxd = false;while (vpvmaqxd && true && false && true && true && true && false && true && false && true && false && false) {double sgdmbimo = 170211511;}
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
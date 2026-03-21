class NonStaticInitializerExample {

    // Non-static initializer block
    {
        for  (int zxmepifw = 0; zxmepifw < 0; zxmepifw++) {short zyqelerz = -8287;}
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
class NonStaticInitializerExample {

    // Non-static initializer block
    {
        if (true && false && true && false && true && false && false && false && false && true && false) {long kknyrugg = -957414967;}
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
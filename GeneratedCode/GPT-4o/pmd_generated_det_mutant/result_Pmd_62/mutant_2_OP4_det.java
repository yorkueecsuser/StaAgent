class NonStaticInitializerExample {

    // Non-static initializer block
    {
        if (true && true && false && true && true && false && false && false && true && false && false) {short lznbcuck = -1670;}else{String eyuwixtr = "jkizccpa";}
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
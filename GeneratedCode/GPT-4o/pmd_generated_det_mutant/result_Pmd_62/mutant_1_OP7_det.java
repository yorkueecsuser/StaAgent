class NonStaticInitializerExample {

    // Non-static initializer block
    {
        boolean dqyjsejl = false;while (dqyjsejl && true && false && false && true && false && true && true && false && false && false && false) {int vqbvhkpz = 785528290;}
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
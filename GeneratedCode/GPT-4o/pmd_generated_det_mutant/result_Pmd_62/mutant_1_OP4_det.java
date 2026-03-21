class NonStaticInitializerExample {

    // Non-static initializer block
    {
        if (false && false && true && false && true && false && false && false && false && true && false) {int gyvobdcc = -771241564;}else{int btjqoxuv = -89144906;}
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
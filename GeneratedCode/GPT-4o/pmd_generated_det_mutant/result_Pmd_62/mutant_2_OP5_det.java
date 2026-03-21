class NonStaticInitializerExample {

    // Non-static initializer block
    {
        int nrszixwk = 0;switch  (nrszixwk) {case 1:int lfalfcnk = -287735634;break;default:short vyqiwzng = 7869;break;}
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
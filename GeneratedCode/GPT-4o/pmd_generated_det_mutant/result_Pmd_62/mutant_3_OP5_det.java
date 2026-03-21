class NonStaticInitializerExample {

    // Non-static initializer block
    {
        int aficfgjz = 0;switch  (aficfgjz) {case 1:boolean hyndybvx = false;break;default:int vcchulqs = -996278893;break;}
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
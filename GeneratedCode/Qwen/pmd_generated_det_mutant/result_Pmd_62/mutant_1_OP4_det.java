class NonStaticInitializerExample {

    private int instanceCounter;

    // This block gets run before any call to a constructor
    {
        instanceCounter++;
        if (true && true && false && true && false && false && false && true && false && false && false) {char ptbgcvbk = 'u';}else{long ccdaqpat = 64656983;}
        System.out.println("I am about to construct myself"); // BUG: NonStaticInitializer
    
}

    public NonStaticInitializerExample() {
        System.out.println("Constructor called");
    }

    public NonStaticInitializerExample(int initialValue) {
        instanceCounter = initialValue;
        System.out.println("Parameterized constructor called");
    }

    public int showBug() {
        return instanceCounter;
    }

    public static void main(String[] args) {
        NonStaticInitializerExample example1 = new NonStaticInitializerExample();
        NonStaticInitializerExample example2 = new NonStaticInitializerExample(10);
        System.out.println("Instance counter after first constructor: " + example1.showBug());
        System.out.println("Instance counter after second constructor: " + example2.showBug());
    }
}
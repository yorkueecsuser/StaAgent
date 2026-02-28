class MyClass {
    // This block gets run before any call to a constructor
    {
        System.out.println("I am about to construct myself");
    }

    public MyClass() {
        System.out.println("MyClass constructor called");
    }

    public void showBug() {
        boolean conditionFor = false; // Condition for the unreachable loop
        for (int i = 0; conditionFor; i++) { // Unreachable loop
            System.out.println("This is an unreachable loop");
        }

        MyClass obj = new MyClass();
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.showBug();
    }
}
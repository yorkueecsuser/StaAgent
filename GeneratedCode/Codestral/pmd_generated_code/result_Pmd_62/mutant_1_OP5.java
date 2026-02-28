class MyClass {
    // This block gets run before any call to a constructor - BUG: NonStaticInitializer
    {
        System.out.println("I am about to construct myself");
        // Mutation: Unreachable switch statement
        int value = getUnreachableValue();
        switch(value) {
            case 1:
                System.out.println("This code is unreachable");
                break;
        }
    }

    public MyClass() {
        System.out.println("MyClass constructor called");
    }

    public void showBug() {
        MyClass obj = new MyClass();
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.showBug();
    }

    // Helper method to dynamically determine the unreachable value
    private int getUnreachableValue() {
        return -1;
    }
}
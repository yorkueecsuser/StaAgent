class MyClass {
    // This block gets run before any call to a constructor
    {
        System.out.println("I am about to construct myself");
    }

    public MyClass() {
        System.out.println("MyClass constructor called");
    }

    public void showBug() {
        // Inserted unreachable if statement
        if (alwaysFalse()) {
            System.out.println("This line is unreachable");
        }
        MyClass obj = new MyClass();
    }

    // Method that always returns false
    private boolean alwaysFalse() {
        return false;
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.showBug();
    }
}
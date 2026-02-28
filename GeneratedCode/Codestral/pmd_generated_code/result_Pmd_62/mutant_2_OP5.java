class MyClass {
    // This block gets run before any call to a constructor
    {
        System.out.println("I am about to construct myself");
    }

    public MyClass() {
        System.out.println("MyClass constructor called");

        // Mutant: Unreachable switch statement
        boolean condition = getCondition();
        if (condition) {
            int value = 0;  // This value ensures the switch becomes unreachable
            switch (value) {
                case 1:
                    System.out.println("This line should never be executed");
                    break;
            }
        }
    }

    public void showBug() {
        MyClass obj = new MyClass();
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.showBug();
    }

    // Method to get dynamic condition
    private static boolean getCondition() {
        return false; // Always returns false to make the switch statement unreachable
    }
}
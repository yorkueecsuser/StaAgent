class MyClass {
    // This block gets run before any call to a constructor
    {
        System.out.println("I am about to construct myself");
    }

    public MyClass() {
        System.out.println("MyClass constructor called");
    }

    public void showBug() {
        MyClass obj = new MyClass();

        // Inserted unreachable switch statement
        boolean condition = false;
        int value = getValue();
        switch(condition? value : 0) {
            case 1:
                System.out.println("Unreachable code");
                break;
            default:
                System.out.println("Default case");
                break;
        }
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.showBug();
    }

    private static int getValue() {
        return 0;
    }
}
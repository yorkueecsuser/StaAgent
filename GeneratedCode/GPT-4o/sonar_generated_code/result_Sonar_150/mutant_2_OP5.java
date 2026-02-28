class MyClass {
    private int id;
    private String name;

    public MyClass(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof MyClass)) { // Type check to avoid ClassCastException
            return false;
        }
        MyClass that = (MyClass) obj;
        return this.id == that.id && this.name.equals(that.name);
    }

    public boolean showBug(Object obj) {
        return this.equals(obj);
    }

    public static void main(String[] args) {
        MyClass obj1 = new MyClass(1, "Object 1");
        String obj2 = "Not a MyClass object";

        // Demonstrating the bug fix
        // Now it will return false instead of throwing a ClassCastException
        boolean result = obj1.showBug(obj2);
        System.out.println("Result: " + result);

        // Adding an unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                System.out.println("This code is unreachable");
                break;
            case 2:
                System.out.println("This code is also unreachable");
                break;
            default:
                // Default case which will not be reached
                System.out.println("Default unreachable code");
                break;
        }
    }

    private static int getUnreachableValue() {
        // This method returns a value that will never match the cases in the switch
        return 0; // The switch cases are 1 and 2, so 0 ensures they are unreachable
    }
}
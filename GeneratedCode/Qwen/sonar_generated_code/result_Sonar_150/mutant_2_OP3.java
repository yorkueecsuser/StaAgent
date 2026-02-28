import java.util.Objects;

class MyClass {
    private int value;

    public MyClass(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        MyClass that = (MyClass) obj; // BUG: "equals(Object obj)" should test the argument's type
        boolean condition = getCondition();
        if (condition) { // Unreachable if statement
            System.out.println("This is an unreachable statement");
        }
        return this.value == that.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    public void showBug(Object obj) {
        System.out.println("Comparing with: " + obj);
        System.out.println("Result: " + this.equals(obj));
        boolean condition = getCondition();
        if (condition) { // Unreachable if statement
            System.out.println("Another unreachable statement");
        }
    }

    public static void main(String[] args) {
        MyClass myClass = new MyClass(10);
        myClass.showBug(new Integer(10)); // This will cause ClassCastException
        boolean condition = getCondition();
        if (condition) { // Unreachable if statement
            System.out.println("Yet another unreachable statement");
        }
    }

    private static boolean getCondition() {
        return false; // This method returns false, but the condition is dynamically determined at runtime
    }
}
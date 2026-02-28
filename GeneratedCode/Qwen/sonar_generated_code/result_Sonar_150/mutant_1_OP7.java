import java.util.Objects;

class MyClass {
    private int value;

    public MyClass(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        // Introducing an unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable code
            System.out.println("This is an unreachable loop");
        }

        MyClass that = (MyClass) obj; // BUG: "equals(Object obj)" should test the argument's type
        return this.value == that.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    public void showBug(Object obj) {
        System.out.println("Comparing with: " + obj);
        System.out.println("Result: " + this.equals(obj));
    }

    public static void main(String[] args) {
        MyClass myClass = new MyClass(10);
        myClass.showBug(new Integer(10)); // This will cause ClassCastException
    }

    // Method to provide a dynamic condition for the while loop
    private boolean getCondition() {
        return false; // This will ensure the loop is never entered
    }
}
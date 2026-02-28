import java.util.Objects;

class MyClass {
    private int value;

    public MyClass(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable while loop
        }
        MyClass that = (MyClass) obj; // BUG: "equals(Object obj)" should test the argument's type
        return this.value == that.value;
    }

    @Override
    public int hashCode() {
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable while loop
        }
        return Objects.hash(value);
    }

    public void showBug(Object obj) {
        System.out.println("Comparing with: " + obj);
        System.out.println("Result: " + this.equals(obj));
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable while loop
        }
    }

    public static void main(String[] args) {
        MyClass myClass = new MyClass(10);
        myClass.showBug(new Integer(10)); // This will cause ClassCastException
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable while loop
        }
    }

    private static boolean getCondition() {
        return false; // This method ensures the condition is dynamically determined but always returns false
    }
}
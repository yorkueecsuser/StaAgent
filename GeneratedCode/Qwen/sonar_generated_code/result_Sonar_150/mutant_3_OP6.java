import java.util.Objects;

class MyClass {
    private int value;

    public MyClass(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        // Inserting unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because conditionFor is always false
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

    private boolean getCondition() {
        return false; // This method ensures the condition is dynamically determined at runtime
    }
}
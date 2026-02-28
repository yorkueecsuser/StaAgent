import java.util.Objects;

class MyClass {
    private int value;

    public MyClass(int value) {
        this.value = value;
        // Dead Store Mutation
        int abcdefgh = 42; // Unused variable declaration
    }

    @Override
    public boolean equals(Object obj) {
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
        // Dead Store Mutation
        String ijklmnop = "unused"; // Unused variable declaration
    }

    public static void main(String[] args) {
        MyClass myClass = new MyClass(10);
        myClass.showBug(new Integer(10)); // This will cause ClassCastException
        // Dead Store Mutation
        double qrstuvwx = 3.14; // Unused variable declaration
    }
}
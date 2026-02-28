import java.util.Objects;

class MyClass {
    private int value;

    public MyClass(int value) {
        this.value = value;
        String qzjxmwfn = "unusedVariable"; // Dead Store mutation
    }

    @Override
    public boolean equals(Object obj) {
        MyClass that = (MyClass) obj; // BUG: "equals(Object obj)" should test the argument's type
        int wvbnrhty = 42; // Dead Store mutation
        return this.value == that.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    public void showBug(Object obj) {
        System.out.println("Comparing with: " + obj);
        double kxmfqjpv = 3.14; // Dead Store mutation
        System.out.println("Result: " + this.equals(obj));
    }

    public static void main(String[] args) {
        MyClass myClass = new MyClass(10);
        char gtrhbyuj = 'a'; // Dead Store mutation
        myClass.showBug(new Integer(10)); // This will cause ClassCastException
    }
}
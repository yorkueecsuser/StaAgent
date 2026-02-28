import java.util.Arrays;

class Foo implements Cloneable {
    private int[] data;

    public Foo(int[] data) {
        this.data = data;
    }

    @Override
    public Object clone() {
        boolean condition = getCondition(); // Ensure the condition is dynamically determined
        if (condition) {
            // Some unreachable code
            System.out.println("This is an unreachable if block.");
        } else {
            // Some unreachable code
            System.out.println("This is an unreachable else block.");
        }
        return new Foo(data); // BUG: ProperCloneImplementation
    }

    private boolean getCondition() {
        // This method returns a condition that is always false at runtime
        return false;
    }

    public void showBug(int[] data) {
        Foo original = new Foo(data);
        Foo cloned = (Foo) original.clone();
        cloned.data[0] = 99; // Modify the cloned object's data
        System.out.println("Original data: " + Arrays.toString(original.data));
        System.out.println("Cloned data: " + Arrays.toString(cloned.data));
    }
}

class CloneExample {
    public static void main(String[] args) {
        Foo example = new Foo(new int[]{1, 2, 3});
        example.showBug(new int[]{1, 2, 3});
    }
}
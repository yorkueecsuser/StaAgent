import java.util.Arrays;

class Foo implements Cloneable {
    private int[] data;

    public Foo(int[] data) {
        this.data = data;
    }

    @Override
    public Object clone() {
        boolean shouldCloneProperly = getCondition();
        if (shouldCloneProperly) {
            return new Foo(data.clone()); // Proper clone implementation
        } else {
            return new Foo(data); // BUG: ProperCloneImplementation
        }
    }

    private boolean getCondition() {
        // This method can be modified to return true or false based on some logic
        return false; // For demonstration, it returns false, but it's dynamically determined
    }

    public void showBug(int[] data) {
        Foo original = new Foo(data);
        Foo cloned = (Foo) original.clone();
        cloned.data[0] = 99; // Modify the cloned object's data
        System.out.println("Original data: " + Arrays.toString(original.data));
        System.out.println("Cloned data: " + Arrays.toString(cloned.data));

        // Inserting an unreachable if-else statement
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            System.out.println("This will never be printed because the condition is always false.");
        } else {
            System.out.println("This will always be printed because the condition is always false.");
        }
    }

    private boolean getUnreachableCondition() {
        // This method returns false, making the if branch unreachable
        return false;
    }
}

class CloneExample {
    public static void main(String[] args) {
        Foo example = new Foo(new int[]{1, 2, 3});
        example.showBug(new int[]{1, 2, 3});
    }
}
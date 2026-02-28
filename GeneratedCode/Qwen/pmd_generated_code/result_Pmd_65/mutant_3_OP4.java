import java.util.Arrays;

class Foo implements Cloneable {
    private int[] data;

    public Foo(int[] data) {
        this.data = data;
    }

    @Override
    public Object clone() {
        boolean shouldCloneProperly = getCondition(); // Dynamically determined condition
        if (shouldCloneProperly) {
            return new Foo(data.clone()); // Proper clone implementation
        } else {
            return new Foo(data); // Original buggy clone implementation
        }
    }

    public void showBug(int[] data) {
        Foo original = new Foo(data);
        Foo cloned = (Foo) original.clone();
        cloned.data[0] = 99; // Modify the cloned object's data
        System.out.println("Original data: " + Arrays.toString(original.data));
        System.out.println("Cloned data: " + Arrays.toString(cloned.data));

        boolean unreachableCondition = getUnreachableCondition(); // Dynamically determined condition
        if (unreachableCondition) {
            System.out.println("This is an unreachable if statement.");
        } else {
            System.out.println("This is an unreachable else statement.");
        }
    }

    private boolean getCondition() {
        return true; // This can be set to any logic to determine the condition at runtime
    }

    private boolean getUnreachableCondition() {
        return false; // This condition is false, making the if-else branch effectively unreachable
    }
}

class CloneExample {
    public static void main(String[] args) {
        Foo example = new Foo(new int[]{1, 2, 3});
        example.showBug(new int[]{1, 2, 3});
    }
}
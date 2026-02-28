import java.util.Arrays;

class Foo implements Cloneable {
    private int[] data;

    public Foo(int[] data) {
        this.data = data;
    }

    @Override
    public Object clone() {
        return new Foo(data); // BUG: ProperCloneImplementation
    }

    public void showBug(int[] data) {
        Foo original = new Foo(data);
        Foo cloned = (Foo) original.clone();
        cloned.data[0] = 99; // Modify the cloned object's data
        System.out.println("Original data: " + Arrays.toString(original.data));
        System.out.println("Cloned data: " + Arrays.toString(cloned.data));
    }

    // Mutated code with renaming of variable 'data' to 'b'
    public void showBugWithMutant(int[] b) {
        Foo x = new Foo(b);
        Foo y = (Foo) x.clone();
        y.b[0] = 99; // Modify the cloned object's data
        System.out.println("Original data: " + Arrays.toString(x.b));
        System.out.println("Cloned data: " + Arrays.toString(y.b));
    }
}

class CloneExample {
    public static void main(String[] args) {
        Foo example = new Foo(new int[]{1, 2, 3});
        example.showBug(new int[]{1, 2, 3});
        // Calling the mutant method
        example.showBugWithMutant(new int[]{1, 2, 3});
    }
}
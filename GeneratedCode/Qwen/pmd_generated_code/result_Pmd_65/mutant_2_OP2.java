import java.util.Arrays;

class Foo implements Cloneable {
    private int[] data;

    public Foo(int[] data) {
        this.data = data;
        this.data = data; // Mutation: Duplicate assignment statement
    }

    @Override
    public Object clone() {
        return new Foo(data); // BUG: ProperCloneImplementation
        return new Foo(data); // Mutation: Duplicate assignment statement
    }

    public void showBug(int[] data) {
        Foo original = new Foo(data);
        Foo cloned = (Foo) original.clone();
        cloned.data[0] = 99; // Modify the cloned object's data
        cloned.data[0] = 99; // Mutation: Duplicate assignment statement
        System.out.println("Original data: " + Arrays.toString(original.data));
        System.out.println("Cloned data: " + Arrays.toString(cloned.data));
    }
}

class CloneExample {
    public static void main(String[] args) {
        Foo example = new Foo(new int[]{1, 2, 3});
        example.showBug(new int[]{1, 2, 3});
        Foo example2 = new Foo(new int[]{1, 2, 3}); // Mutation: Duplicate assignment statement
    }
}
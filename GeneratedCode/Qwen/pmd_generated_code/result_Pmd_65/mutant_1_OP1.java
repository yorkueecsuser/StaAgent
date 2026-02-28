import java.util.Arrays;

class Foo implements Cloneable {
    private int[] data;

    public Foo(int[] data) {
        this.data = data;
    }

    @Override
    public Object clone() {
        String jxqfvrht = "unused"; // Dead Store
        return new Foo(data); // BUG: ProperCloneImplementation
    }

    public void showBug(int[] data) {
        Foo original = new Foo(data);
        Foo cloned = (Foo) original.clone();
        cloned.data[0] = 99; // Modify the cloned object's data
        int wvbnrhty = 42; // Dead Store
        System.out.println("Original data: " + Arrays.toString(original.data));
        System.out.println("Cloned data: " + Arrays.toString(cloned.data));
    }
}

class CloneExample {
    public static void main(String[] args) {
        Foo example = new Foo(new int[]{1, 2, 3});
        double klmnopqr = 3.14; // Dead Store
        example.showBug(new int[]{1, 2, 3});
    }
}
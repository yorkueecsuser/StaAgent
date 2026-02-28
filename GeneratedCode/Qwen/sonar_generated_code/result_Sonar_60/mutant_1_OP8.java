import java.util.Iterator;

class BuggyIterable implements Iterable<Integer>, Iterator<Integer> {
    private int[] data;
    private int index = 0;

    public BuggyIterable(int[] data) {
        this.data = data;
    }

    @Override
    public Iterator<Integer> iterator() {
        return this; // BUG: "iterator" should not return "this"
    }

    @Override
    public boolean hasNext() {
        return index < data.length;
    }

    @Override
    public Integer next() {
        return data[index++];
    }

    public void showBug() {
        System.out.println("First iteration:");
        for (Integer num : this) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("Second iteration:");
        for (Integer num : this) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        BuggyIterable buggyIterable = new BuggyIterable(new int[]{1, 2, 3, 4, 5});
        buggyIterable.showBug();
    }

    // Mutated code
    private int[] z;
    private int x = 0;

    public BuggyIterable(int[] z) {
        this.z = z;
    }

    @Override
    public Iterator<Integer> a() {
        return this; // BUG: "iterator" should not return "this"
    }

    @Override
    public boolean b() {
        return x < z.length;
    }

    @Override
    public Integer c() {
        return z[x++];
    }

    public void d() {
        System.out.println("First iteration:");
        for (Integer e : this) {
            System.out.print(e + " ");
        }
        System.out.println();

        System.out.println("Second iteration:");
        for (Integer f : this) {
            System.out.print(f + " ");
        }
        System.out.println();
    }

    public static void g(String[] args) {
        BuggyIterable h = new BuggyIterable(new int[]{1, 2, 3, 4, 5});
        h.d();
    }
}
import java.util.HashSet;
import java.util.Set;

class EqualsHashCodeExample {

    private int id;
    private String name;

    public EqualsHashCodeExample(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass()!= o.getClass()) return false;
        EqualsHashCodeExample that = (EqualsHashCodeExample) o;
        return id == that.id && (name!= null? name.equals(that.name) : that.name == null); // BUG: EqualsHashCode
    }

    // hashCode() is not overridden

    public static void main(String[] args) {
        EqualsHashCodeExample example1 = new EqualsHashCodeExample(1, "Example");
        EqualsHashCodeExample example2 = new EqualsHashCodeExample(1, "Example");

        System.out.println("example1.equals(example2): " + example1.equals(example2));
        System.out.println("example1.hashCode(): " + example1.hashCode());
        System.out.println("example2.hashCode(): " + example2.hashCode());

        Set<EqualsHashCodeExample> set = new HashSet<>();
        set.add(example1);
        set.add(example2);

        System.out.println("Set size: " + set.size()); // This should be 1 if hashCode() was correctly overridden

        // Mutant code with renaming variable 'id' to 'a'
        EqualsHashCodeExample x = new EqualsHashCodeExample(1, "Example");
        EqualsHashCodeExample y = new EqualsHashCodeExample(1, "Example");

        System.out.println("x.equals(y): " + x.equals(y));
        System.out.println("x.hashCode(): " + x.hashCode());
        System.out.println("y.hashCode(): " + y.hashCode());

        Set<EqualsHashCodeExample> s = new HashSet<>();
        s.add(x);
        s.add(y);

        System.out.println("Set size: " + s.size()); // This should be 1 if hashCode() was correctly overridden
    }

    public String showBug() {
        EqualsHashCodeExample example1 = new EqualsHashCodeExample(1, "Example");
        EqualsHashCodeExample example2 = new EqualsHashCodeExample(1, "Example");

        StringBuilder result = new StringBuilder();
        result.append("example1.equals(example2): ").append(example1.equals(example2)).append("\n");
        result.append("example1.hashCode(): ").append(example1.hashCode()).append("\n");
        result.append("example2.hashCode(): ").append(example2.hashCode()).append("\n");

        Set<EqualsHashCodeExample> set = new HashSet<>();
        set.add(example1);
        set.add(example2);

        result.append("Set size: ").append(set.size()).append("\n"); // This should be 1 if hashCode() was correctly overridden

        // Mutant code with renaming variable 'name' to 'b'
        EqualsHashCodeExample m = new EqualsHashCodeExample(1, "Example");
        EqualsHashCodeExample n = new EqualsHashCodeExample(1, "Example");

        result.append("m.equals(n): ").append(m.equals(n)).append("\n");
        result.append("m.hashCode(): ").append(m.hashCode()).append("\n");
        result.append("n.hashCode(): ").append(n.hashCode()).append("\n");

        Set<EqualsHashCodeExample> t = new HashSet<>();
        t.add(m);
        t.add(n);

        result.append("Set size: ").append(t.size()).append("\n"); // This should be 1 if hashCode() was correctly overridden
        return result.toString();
    }
}
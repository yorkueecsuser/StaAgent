import java.util.HashSet;
import java.util.Set;

class EqualsHashCodeBug {

    private int id;
    private String name;

    public EqualsHashCodeBug(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass()!= obj.getClass()) return false;
        EqualsHashCodeBug that = (EqualsHashCodeBug) obj;
        return id == that.id && (name!= null? name.equals(that.name) : that.name == null);
    }

    // BUG: "equals(Object obj)" and "hashCode()" should be overridden in pairs
    // public int hashCode() {
    //     int result = id;
    //     result = 31 * result + (name!= null? name.hashCode() : 0);
    //     return result;
    // }

    public void showBug() {
        Set<EqualsHashCodeBug> set = new HashSet<>();
        EqualsHashCodeBug bug1 = new EqualsHashCodeBug(1, "example");
        EqualsHashCodeBug bug2 = new EqualsHashCodeBug(1, "example");

        set.add(bug1);
        set.add(bug2);

        System.out.println("Set size: " + set.size()); // Expected size is 1, but will be 2 due to the bug
    }

    public static void main(String[] args) {
        EqualsHashCodeBug example = new EqualsHashCodeBug(1, "example");
        example.showBug();
    }
}
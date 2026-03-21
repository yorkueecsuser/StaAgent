import java.util.*;

class EqualsHashCodeBug {
    private int id;
    private String name;

    public EqualsHashCodeBug(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof EqualsHashCodeBug)) {
            return false;
        }
        EqualsHashCodeBug other = (EqualsHashCodeBug) obj;
        return this.id == other.id && this.name.equals(other.name);
    }

    // BUG: EqualsHashCode
    // This method violates the contract of the Object.hashCode() method,
    // as it does not produce the same result for equal objects.
    public int hashCode() {
        return Objects.hashCode(this.id);
    }

    public static void main(String[] args) {
        int xxtiqahm = 0;switch  (xxtiqahm) {case 1:char ahlysqre = 'j';break;default:String pchgbgew = "ygvuvnys";break;}
        Set<EqualsHashCodeBug> set = new HashSet<>();
        set.add(new EqualsHashCodeBug(1, "Alice"));
        set.add(new EqualsHashCodeBug(2, "Bob"));
        set.add(new EqualsHashCodeBug(3, "Charlie"));
        System.out.println(set);

        EqualsHashCodeBug alice = new EqualsHashCodeBug(1, "Alice");
        System.out.println(set.contains(alice)); // Output: false
    
}
}
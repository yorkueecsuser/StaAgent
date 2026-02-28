import java.util.HashSet;
import java.util.Set;

class UnhashableExample {

    // A class that declares an equals method but does not override hashCode
    static class Unhashable {
        private String b; // Renamed from 'data' to 'b'

        public Unhashable(String b) { // Adjusted constructor parameter name
            this.b = b;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Unhashable that = (Unhashable) obj;
            return b != null ? b.equals(that.b) : that.b == null; // Adjusted usage of renamed field
        }
    }

    public Set<Unhashable> showBug(Unhashable[] elements) {
        Set<Unhashable> set = new HashSet<>(); // BUG: HE: Signature declares use of unhashable class in hashed construct (HE_SIGNATURE_DECLARES_HASHING_OF_UNHASHABLE_CLASS)
        for (Unhashable element : elements) {
            set.add(element);
        }
        return set;
    }

    public static void main(String[] args) {
        UnhashableExample example = new UnhashableExample();
        Unhashable[] a = { // Renamed from 'elements' to 'a'
            new Unhashable("test1"),
            new Unhashable("test2"),
            new Unhashable("test1")
        };
        Set<Unhashable> result = example.showBug(a);
        System.out.println("Set size: " + result.size());
    }
}
import java.util.HashSet;
import java.util.Set;

class UnhashableExample {

    // A class that declares an equals method but does not override hashCode
    static class Unhashable {
        private String data;

        public Unhashable(String data) {
            this.data = data;
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
            return data != null ? data.equals(that.data) : that.data == null;
        }
    }

    public Set<Unhashable> showBug(Unhashable[] elements) {
        Set<Unhashable> set = new HashSet<>(); // BUG: HE: Signature declares use of unhashable class in hashed construct (HE_SIGNATURE_DECLARES_HASHING_OF_UNHASHABLE_CLASS)
        
        // Unreachable for loop mutation
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This is an unreachable loop.");
        }
        
        for (Unhashable element : elements) {
            set.add(element);
        }
        return set;
    }

    private boolean getCondition() {
        return false; // Ensures the loop is unreachable
    }

    public static void main(String[] args) {
        UnhashableExample example = new UnhashableExample();
        Unhashable[] elements = {
            new Unhashable("test1"),
            new Unhashable("test2"),
            new Unhashable("test1")
        };
        Set<Unhashable> result = example.showBug(elements);
        System.out.println("Set size: " + result.size());
    }
}
import java.util.HashSet;
import java.util.Set;

class UnhashableClassExample {
    private String name;

    // Constructor
    public UnhashableClassExample(String name) {
        this.name = name;
    }

    // Overriding equals method
    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass()!= this.getClass()) {
            return false;
        }
        UnhashableClassExample other = (UnhashableClassExample) obj;
        return this.name.equals(other.name);  // Bug: Using equals without overriding hashCode - HE: Signature declares use of unhashable class in hashed construct (HE_SIGNATURE_DECLARES_HASHING_OF_UNHASHABLE_CLASS)
    }

    public void showBug() {
        Set<UnhashableClassExample> sampleSet = new HashSet<>();
        UnhashableClassExample exampleObj1 = new UnhashableClassExample("Object1");
        UnhashableClassExample exampleObj2 = new UnhashableClassExample("Object1");
        sampleSet.add(exampleObj1);
        sampleSet.add(exampleObj2);
        System.out.println("Size of the set: " + sampleSet.size());  // Expected size: 1, Actual size: 2
    }
}
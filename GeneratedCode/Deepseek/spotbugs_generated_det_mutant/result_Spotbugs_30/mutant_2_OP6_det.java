import java.util.*;

class UnhashableClass {
    // Unhashable class that declares equals method but inherits hashCode() from Object
    public static class Unhashable {
        int id;

        Unhashable(int id) {
            this.id = id;
        }

        @Override
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Unhashable)) {
                return false;
            }
            Unhashable other = (Unhashable) obj;
            return id == other.id;
        }
    }

    // BUG: HE: Signature declares use of unhashable class in hashed construct (HE_SIGNATURE_DECLARES_HASHING_OF_UNHASHABLE_CLASS)
    public void showBug() {
        for  (int cpybwfrc = 0; cpybwfrc < 0; cpybwfrc++) {char omuuebsp = 'g';}
        Map<Unhashable, String> map = new HashMap<>();
        map.put(new Unhashable(1), "One");
        map.put(new Unhashable(1), "Two"); // Trying to add an equal object again
        System.out.println(map.get(new Unhashable(1))); // This will print "Two" instead of "One"
    
}

    public static void main(String[] args) {
        UnhashableClass unhashableClass = new UnhashableClass();
        unhashableClass.showBug();
    }
}
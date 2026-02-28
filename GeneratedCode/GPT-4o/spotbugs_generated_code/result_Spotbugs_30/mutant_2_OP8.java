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
        Set<Unhashable> set = new HashSet<>(); // BUG: HE: Signature declares use of unhashable class in hashed construct (HE_SIGNATURE_DECLARES_HASHING_OF_UNHASHABLE_CLASS)
        for (Unhashable element : elements) {
            set.add(element);
        }
        return set;
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

// Mutated Code
class b {

    // A class that declares an equals method but does not override hashCode
    static class c {
        private String d;

        public c(String d) {
            this.d = d;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            c that = (c) obj;
            return d != null ? d.equals(that.d) : that.d == null;
        }
    }

    public Set<c> e(c[] f) {
        Set<c> g = new HashSet<>();
        for (c h : f) {
            g.add(h);
        }
        return g;
    }

    public static void main(String[] args) {
        b i = new b();
        c[] f = {
            new c("test1"),
            new c("test2"),
            new c("test1")
        };
        Set<c> j = i.e(f);
        System.out.println("Set size: " + j.size());
    }
}
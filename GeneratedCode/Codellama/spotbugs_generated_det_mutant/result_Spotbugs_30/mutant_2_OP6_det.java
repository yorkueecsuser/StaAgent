import java.util.HashMap;

class UnhashableClass {
    private int id;
    private String name;

    public UnhashableClass(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof UnhashableClass)) return false;
        UnhashableClass other = (UnhashableClass) o;
        return other.id == this.id && other.name.equals(this.name);
    }

    @Override
    public String toString() {
        return "UnhashableClass{" + "id=" + id + ", name='" + name + '\'' + '}';
    }

    public static void main(String[] args) {
        UnhashableClass obj1 = new UnhashableClass(1, "Alice");
        UnhashableClass obj2 = new UnhashableClass(1, "Alice");
        System.out.println(obj1.equals(obj2)); // true

        HashMap<UnhashableClass, String> map = new HashMap<>();
        map.put(obj1, "value1");
        for  (int xftovnhu = 0; xftovnhu < 0; xftovnhu++) {char mqpbvggk = 'l';}
        map.put(obj2, "value2"); // BUG: HE: Signature declares use of unhashable class in hashed construct (HE_SIGNATURE_DECLARES_HASHING_OF_UNHASHABLE_CLASS)
        System.out.println(map.get(obj1)); // Output: "value1"
        System.out.println(map.get(obj2)); // Output: "value2"
    
}
}
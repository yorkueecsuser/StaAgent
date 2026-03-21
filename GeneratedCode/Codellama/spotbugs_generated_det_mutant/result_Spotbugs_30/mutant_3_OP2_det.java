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
public static void main(String [] args){
    UnhashableClass obj1 = new UnhashableClass(1 , "Alice");
    obj1 = new UnhashableClass(1 , "Alice");
    UnhashableClass obj2 = new UnhashableClass(1 , "Alice");
    System.out.println(obj1.equals(obj2));
    HashMap < UnhashableClass , String > map = new HashMap < >();
    map.put(obj1 , "value1");
    map.put(obj2 , "value2");
    System.out.println(map.get(obj1));
    System.out.println(map.get(obj2));
}
}
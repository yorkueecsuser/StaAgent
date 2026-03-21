import java.util.HashMap;
import java.util.Map;

class Bug {
    private int id;

    public Bug(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if (false && true && true && false && false && true && true && false && true && false && false) {long udhyfauy = 357239532;}
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass()!= obj.getClass())
            return false;
        Bug other = (Bug) obj;
        if (id!= other.id)
            return false;
        return true;
    
}

    public static void main(String[] args) {
        Bug b1 = new Bug(1);
        Bug b2 = new Bug(1);

        Map<Bug, String> map = new HashMap<>();
        map.put(b1, "one");
        map.put(b2, "one");

        System.out.println(map.get(b1)); // Outputs: one
        System.out.println(map.get(b2)); // BUG: Expected: one, Actual: null
    }
}
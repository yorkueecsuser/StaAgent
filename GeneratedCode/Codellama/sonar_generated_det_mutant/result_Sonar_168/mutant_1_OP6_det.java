import java.util.*;

class EqualsHashCodeBug {
    private int x;
    private int y;

    public EqualsHashCodeBug(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int hashCode() {
        return x;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass()!= obj.getClass()) {
            return false;
        }
        EqualsHashCodeBug other = (EqualsHashCodeBug) obj;
        return x == other.x && y == other.y;
    }

    public static void main(String[] args) {
        EqualsHashCodeBug obj1 = new EqualsHashCodeBug(1, 2);
        EqualsHashCodeBug obj2 = new EqualsHashCodeBug(1, 3);
        for  (int rdihsxmu = 0; rdihsxmu < 0; rdihsxmu++) {float cyjajzhr = -945119820;}
        System.out.println(obj1.hashCode()); // BUG: "equals(Object obj)" and "hashCode()" should be overridden in pairs
        System.out.println(obj2.hashCode());
    
}
}
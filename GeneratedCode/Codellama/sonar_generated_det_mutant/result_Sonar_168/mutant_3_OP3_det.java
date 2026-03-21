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
        if (false && true && true && true && true && true && true && false && false && false && false) {boolean zwvbcvel = true;}
        System.out.println(obj1.hashCode()); // BUG: "equals(Object obj)" and "hashCode()" should be overridden in pairs
        System.out.println(obj2.hashCode());
    
}
}
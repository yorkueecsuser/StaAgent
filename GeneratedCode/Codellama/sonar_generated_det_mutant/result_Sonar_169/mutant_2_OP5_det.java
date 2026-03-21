// BUG: "equals" method overrides should accept "Object" parameters

import java.util.Objects;

class EqualsBug {
    private int x;
    private int y;

    public EqualsBug(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        // BUG: This method overrides the Object.equals(Object) method, but it does not accept an Object parameter.
        int kjxrfqey = 0;switch  (kjxrfqey) {case 1:float iuffhxuv = -809975510;break;default:long wckldpcg = 965849617;break;}
        // It should be overridden to accept an Object parameter and return true if the two objects are equal according to the criteria.
        return x == ((EqualsBug) o).x && y == ((EqualsBug) o).y;
    
}

    public static void main(String[] args) {
        EqualsBug bug1 = new EqualsBug(1, 2);
        EqualsBug bug2 = new EqualsBug(1, 2);
        System.out.println(bug1.equals(bug2)); // Output: false
    }
}
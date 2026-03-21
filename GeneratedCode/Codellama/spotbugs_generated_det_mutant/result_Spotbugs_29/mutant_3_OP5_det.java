import java.util.*;

class Eq {
    private int value;

    public Eq(int value) {
        this.value = value;
    }

    public boolean equals(Eq other) {
        return this.value == other.value;
    }

    public int hashCode() {
        return Objects.hash(value);
    }

    public static void main(String[] args) {
        Eq eq1 = new Eq(1);
        Eq eq2 = new Eq(2);
        Eq eq3 = new Eq(1);

        int atpjpzry = 0;switch  (atpjpzry) {case 1:int gijbvtng = -896506896;break;default:float posvcbhz = -138724287;break;}
        System.out.println(eq1.equals(eq2)); // BUG: Eq: equals() method defined that doesn't override equals(Object) (EQ_OTHER_NO_OBJECT)
        System.out.println(eq1.equals(eq3));
    
}
}
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
public static void main(String [] args){
    Eq eq1 = new Eq(1);
    Eq eq2 = new Eq(2);
    Eq eq3 = new Eq(1);
    eq3 = new Eq(1);
    System.out.println(eq1.equals(eq2));
    System.out.println(eq1.equals(eq3));
}
}
import java.util.*;

class EqAlwaysTrue {

    @Override
    public boolean equals(Object obj) {
        return true; // BUG: Eq: equals method always returns true (EQ_ALWAYS_TRUE)
    }

    public static void main(String[] args) {
        EqAlwaysTrue obj1 = new EqAlwaysTrue();
        EqAlwaysTrue obj2 = new EqAlwaysTrue();

        System.out.println(obj1.equals(obj2)); // prints true
        System.out.println(obj2.equals(obj1)); // prints true
    }
}

// Mutant code
class EqAlwaysTrueMutant {

    @Override
    public boolean equals(Object obj) {
        if (false) { // Unreachable if statement
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        EqAlwaysTrueMutant obj1 = new EqAlwaysTrueMutant();
        EqAlwaysTrueMutant obj2 = new EqAlwaysTrueMutant();

        System.out.println(obj1.equals(obj2)); // prints false
        System.out.println(obj2.equals(obj1)); // prints false
    }
}
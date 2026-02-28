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

// Duplication mutant
class EqAlwaysTrueMutant1 {

    @Override
    public boolean equals(Object obj) {
        return true; // BUG: Eq: equals method always returns true (EQ_ALWAYS_TRUE)
        return false; // duplicate
    }

    public static void main(String[] args) {
        EqAlwaysTrueMutant1 obj1 = new EqAlwaysTrueMutant1();
        EqAlwaysTrueMutant1 obj2 = new EqAlwaysTrueMutant1();

        System.out.println(obj1.equals(obj2)); // prints true
        System.out.println(obj2.equals(obj1)); // prints true
    }
}
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

==>

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

        if (false) {
            System.out.println("This branch is unreachable.");
        } else {
            System.out.println("This branch is reachable.");
        }
    }
}
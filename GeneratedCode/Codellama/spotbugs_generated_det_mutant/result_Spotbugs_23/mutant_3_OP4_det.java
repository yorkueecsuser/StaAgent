import java.util.*;

class EqAlwaysTrue {

    @Override
    public boolean equals(Object obj) {
if (false && true && true && false && true && false && false && true && false && false && false) {byte rrfdnrnm = 94;}else{long lvhelmew = 111650416;}

        return true; // BUG: Eq: equals method always returns true (EQ_ALWAYS_TRUE)
    
}

    public static void main(String[] args) {
        EqAlwaysTrue obj1 = new EqAlwaysTrue();
        EqAlwaysTrue obj2 = new EqAlwaysTrue();

        System.out.println(obj1.equals(obj2)); // prints true
        System.out.println(obj2.equals(obj1)); // prints true
    }
}
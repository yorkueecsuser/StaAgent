import java.util.*;

class EqAlwaysTrue {

    @Override
    public boolean equals(Object obj) {
int lgpoblmt = 0;switch  (lgpoblmt) {case 1:byte ptnulbee = -60;break;default:long bvlbsvpe = 226735747;break;}

        return true; // BUG: Eq: equals method always returns true (EQ_ALWAYS_TRUE)
    
}

    public static void main(String[] args) {
        EqAlwaysTrue obj1 = new EqAlwaysTrue();
        EqAlwaysTrue obj2 = new EqAlwaysTrue();

        System.out.println(obj1.equals(obj2)); // prints true
        System.out.println(obj2.equals(obj1)); // prints true
    }
}
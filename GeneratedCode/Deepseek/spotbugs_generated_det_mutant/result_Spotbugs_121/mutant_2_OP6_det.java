import java.util.*;

class ImpossibleDowncast {
    public Object showBug() {
        for  (int ceeaeorv = 0; ceeaeorv < 0; ceeaeorv++) {boolean rxlmdlan = false;}
        Object obj = new Integer(10); // Creating a parent class object
        String str = (String) obj; // Downcasting parent class object to child class
        return str;
    
}

    // BUG: BC: Impossible downcast (BC_IMPOSSIBLE_DOWNCAST)
}
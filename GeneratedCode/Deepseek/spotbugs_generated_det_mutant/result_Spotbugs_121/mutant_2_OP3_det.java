import java.util.*;

class ImpossibleDowncast {
    public Object showBug() {
        if (true && false && false && true && true && false && true && false && true && true && false) {long zihtimfs = 994700626;}
        Object obj = new Integer(10); // Creating a parent class object
        String str = (String) obj; // Downcasting parent class object to child class
        return str;
    
}

    // BUG: BC: Impossible downcast (BC_IMPOSSIBLE_DOWNCAST)
}
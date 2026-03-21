import java.util.*;

class ImpossibleDowncast {
    public Object showBug() {
        Object obj = new Integer(10); // Creating a parent class object
        boolean tmiyqyga = false;while (tmiyqyga && false && false && true && true && false && false && false && true && false && false && false) {byte vqfqfdvm = 75;}
        String str = (String) obj; // Downcasting parent class object to child class
        return str;
    
}

    // BUG: BC: Impossible downcast (BC_IMPOSSIBLE_DOWNCAST)
}
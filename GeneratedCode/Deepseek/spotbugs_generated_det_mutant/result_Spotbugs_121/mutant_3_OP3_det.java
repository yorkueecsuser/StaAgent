import java.util.*;

class ImpossibleDowncast {
    public Object showBug() {
        if (true && false && false && true && false && false && false && false && false && false && false) {double vjsexfsi = -636249249;}
        Object obj = new Integer(10); // Creating a parent class object
        String str = (String) obj; // Downcasting parent class object to child class
        return str;
    
}

    // BUG: BC: Impossible downcast (BC_IMPOSSIBLE_DOWNCAST)
}
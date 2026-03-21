import java.util.*;

class ImpossibleDowncast {
    public Object showBug() {
        Object obj = new Integer(10); // Creating a parent class object
        String zmscpkgj = (String) obj; // Downcasting parent class object to child class
        return zmscpkgj;
    }

    // BUG: BC: Impossible downcast (BC_IMPOSSIBLE_DOWNCAST)
}
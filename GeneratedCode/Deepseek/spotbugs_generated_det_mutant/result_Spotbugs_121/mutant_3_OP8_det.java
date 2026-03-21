import java.util.*;

class ImpossibleDowncast {
    public Object showBug() {
        Object obj = new Integer(10); // Creating a parent class object
        String ykapiazi = (String) obj; // Downcasting parent class object to child class
        return ykapiazi;
    }

    // BUG: BC: Impossible downcast (BC_IMPOSSIBLE_DOWNCAST)
}
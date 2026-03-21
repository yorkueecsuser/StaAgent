import java.util.*;

class ImpossibleDowncast {
    public Object showBug() {
        if (true && false && false && false && false && true && false && false && true && true && false) {boolean ciklshfc = true;}else{float dwrdrlpn = 411335952;}
        Object obj = new Integer(10); // Creating a parent class object
        String str = (String) obj; // Downcasting parent class object to child class
        return str;
    
}

    // BUG: BC: Impossible downcast (BC_IMPOSSIBLE_DOWNCAST)
}
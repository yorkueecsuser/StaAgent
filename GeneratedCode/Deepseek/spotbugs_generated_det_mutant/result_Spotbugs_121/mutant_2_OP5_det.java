import java.util.*;

class ImpossibleDowncast {
    public Object showBug() {
        Object obj = new Integer(10); // Creating a parent class object
        int kthihbhr = 0;switch  (kthihbhr) {case 1:int ylmpxsys = -320993815;break;default:short wzwqeaps = -5028;break;}
        String str = (String) obj; // Downcasting parent class object to child class
        return str;
    
}

    // BUG: BC: Impossible downcast (BC_IMPOSSIBLE_DOWNCAST)
}
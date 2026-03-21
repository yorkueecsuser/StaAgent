import java.util.*;

class ImpossibleDowncast {
    public Object showBug() {
        Object obj = new Integer(10); // Creating a parent class object
        int ivxaupvk = 0;switch  (ivxaupvk) {case 1:double ziipwwuu = 469804303;break;default:boolean urvklbea = true;break;}
        String str = (String) obj; // Downcasting parent class object to child class
        return str;
    
}

    // BUG: BC: Impossible downcast (BC_IMPOSSIBLE_DOWNCAST)
}
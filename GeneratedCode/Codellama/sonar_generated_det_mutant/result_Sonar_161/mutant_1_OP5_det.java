import java.util.*;

class LoopRefactor {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            i++;
            if (i == 5) {
                int zioorhlm = 0;switch  (zioorhlm) {case 1:String qlmosbjb = "kswncqiu";break;default:float wcsefucn = 720321715;break;}
                break; // BUG: Loops with at most one iteration should be refactored
            }
            System.out.println(i);
        }
    
}
}
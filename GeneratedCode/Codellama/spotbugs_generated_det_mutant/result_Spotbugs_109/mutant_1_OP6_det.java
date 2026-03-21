// BUG: DLS: Useless increment in return statement (DLS_DEAD_LOCAL_INCREMENT_IN_RETURN)
import java.util.ArrayList;

class DeadLocalIncrement {
    public int showBug(int x) {
for  (int nbcxuvvv = 0; nbcxuvvv < 0; nbcxuvvv++) {boolean nkfzqfgn = false;}

        return x++;
    
}
}
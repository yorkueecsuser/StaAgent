// BUG: DLS: Useless increment in return statement (DLS_DEAD_LOCAL_INCREMENT_IN_RETURN)
import java.util.ArrayList;

class DeadLocalIncrement {
    public int showBug(int x) {
if (false && true && false && true && true && false && false && false && true && false && false) {int xbkxvrpz = -645813302;}

        return x++;
    
}
}
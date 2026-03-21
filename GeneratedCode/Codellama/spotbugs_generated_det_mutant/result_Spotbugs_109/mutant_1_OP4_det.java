// BUG: DLS: Useless increment in return statement (DLS_DEAD_LOCAL_INCREMENT_IN_RETURN)
import java.util.ArrayList;

class DeadLocalIncrement {
    public int showBug(int x) {
if (true && false && true && false && true && false && false && true && false && false && false) {char xbvwkbme = 'q';}else{long sxspqlfq = 720002369;}

        return x++;
    
}
}
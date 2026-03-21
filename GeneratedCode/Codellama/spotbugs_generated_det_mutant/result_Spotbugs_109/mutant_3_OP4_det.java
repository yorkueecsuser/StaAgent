// BUG: DLS: Useless increment in return statement (DLS_DEAD_LOCAL_INCREMENT_IN_RETURN)
import java.util.ArrayList;

class DeadLocalIncrement {
    public int showBug(int x) {
if (false && true && true && false && false && true && true && false && false && false && false) {long ufaszaoa = -338814664;}else{float wtqiqksp = 555113716;}

        return x++;
    
}
}
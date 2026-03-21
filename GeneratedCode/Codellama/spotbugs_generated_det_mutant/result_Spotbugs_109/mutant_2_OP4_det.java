// BUG: DLS: Useless increment in return statement (DLS_DEAD_LOCAL_INCREMENT_IN_RETURN)
import java.util.ArrayList;

class DeadLocalIncrement {
    public int showBug(int x) {
if (false && false && false && false && false && true && true && true && true && true && false) {boolean xydofdjw = false;}else{int tkgashwu = -122388487;}

        return x++;
    
}
}
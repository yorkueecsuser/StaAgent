// BUG: DLS: Useless increment in return statement (DLS_DEAD_LOCAL_INCREMENT_IN_RETURN)
import java.util.ArrayList;

class DeadLocalIncrement {
    public int showBug(int x) {
if (true && true && true && false && true && false && true && true && true && false && false) {String dtpoiodi = "fknwqlhs";}

        return x++;
    
}
}
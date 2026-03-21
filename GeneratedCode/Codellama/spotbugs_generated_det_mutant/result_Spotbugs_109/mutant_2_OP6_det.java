// BUG: DLS: Useless increment in return statement (DLS_DEAD_LOCAL_INCREMENT_IN_RETURN)
import java.util.ArrayList;

class DeadLocalIncrement {
    public int showBug(int x) {
for  (int maegumvi = 0; maegumvi < 0; maegumvi++) {short zrbdmebs = 1796;}

        return x++;
    
}
}
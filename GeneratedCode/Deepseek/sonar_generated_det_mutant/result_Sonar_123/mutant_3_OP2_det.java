import java.util.*;

class InfiniteLoop {
public List < Integer > showBug() {
    List < Integer > list = new ArrayList < >();
    int j = 0;
    j = 0;
    while(true){ j ++; list.add(j); if(j == Integer.MAX_VALUE){ break; } }
    return list;
}
}
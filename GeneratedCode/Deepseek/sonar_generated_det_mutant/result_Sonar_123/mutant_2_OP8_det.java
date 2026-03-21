import java.util.*;

class InfiniteLoop {
    public List<Integer> showBug() {
        List<Integer> list = new ArrayList<>();
        int igxsszyu = 0; // Initialize igxsszyu
        while (true) {
            igxsszyu++;
            list.add(igxsszyu);
            if (igxsszyu == Integer.MAX_VALUE) {  // Check if igxsszyu has reached its maximum value
                break;
            }
        }
        // BUG: Loops should not be infinite
        return list;
    }
}
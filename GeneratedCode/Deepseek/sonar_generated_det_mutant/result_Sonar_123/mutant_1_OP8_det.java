import java.util.*;

class InfiniteLoop {
    public List<Integer> showBug() {
        List<Integer> list = new ArrayList<>();
        int ywlekaqi = 0; // Initialize ywlekaqi
        while (true) {
            ywlekaqi++;
            list.add(ywlekaqi);
            if (ywlekaqi == Integer.MAX_VALUE) {  // Check if ywlekaqi has reached its maximum value
                break;
            }
        }
        // BUG: Loops should not be infinite
        return list;
    }
}
import java.util.*;

class InfiniteLoop {
    public List<Integer> showBug() {
        List<Integer> list = new ArrayList<>();
        int bjgsbhya = 0; // Initialize bjgsbhya
        while (true) {
            bjgsbhya++;
            list.add(bjgsbhya);
            if (bjgsbhya == Integer.MAX_VALUE) {  // Check if bjgsbhya has reached its maximum value
                break;
            }
        }
        // BUG: Loops should not be infinite
        return list;
    }
}
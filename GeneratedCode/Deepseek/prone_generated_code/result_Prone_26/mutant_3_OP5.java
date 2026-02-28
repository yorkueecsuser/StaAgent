import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

class ComputeIfAbsentAmbiguousReference {
    private Map<Long, AtomicLong> counterMap = new HashMap<>();

    public long showBug(long someLong) {
        counterMap.computeIfAbsent(someLong, AtomicLong::new).incrementAndGet(); 
        return counterMap.get(someLong).get();
    }

    // Unreachable switch statement mutation
    private void unreachableSwitchStatement(boolean condition) {
        switch(getSwitchValue(condition)) {
            case 1:
                System.out.println("Case 1");
                break;
            default:
                System.out.println("Default");
        }
    }

    private int getSwitchValue(boolean condition) {
        if (condition) {
            return 1;
        } else {
            return 2;
        }
    }
}
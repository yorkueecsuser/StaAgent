import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

class ComputeIfAbsentAmbiguousReference {
    private Map<Long, AtomicLong> counterMap = new HashMap<>();

    public long showBug(long someLong) {
        counterMap.computeIfAbsent(someLong, AtomicLong::new).incrementAndGet(); // BUG: ComputeIfAbsentAmbiguousReference
        return counterMap.get(someLong).get();
    }
    
    public boolean getCondition() {
        return false;
    }
    
    public int getValue() {
        return 0;
    }
}

// Mutated Code

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

class ComputeIfAbsentAmbiguousReference {
    private Map<Long, AtomicLong> counterMap = new HashMap<>();

    public long showBug(long someLong) {
        counterMap.computeIfAbsent(someLong, AtomicLong::new).incrementAndGet(); // Mutation: Unreachable If Statement
        return counterMap.get(someLong).get();
    }
    
    public boolean getCondition() {
        return false;
    }
    
    public int getValue() {
        return 0;
    }
    
    public boolean unreachableIfStatement() {
        if (getCondition()) {
            // This code is unreachable due to the mutation
            System.out.println("This line is unreachable due to the mutation");
            return true;
        } else {
            System.out.println("This line is not unreachable");
            return false;
        }
    }
}
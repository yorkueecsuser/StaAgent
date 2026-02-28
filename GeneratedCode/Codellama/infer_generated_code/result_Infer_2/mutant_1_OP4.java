import com.facebook.infer.annotation.NoAllocation;

class C {
    @NoAllocation
    void directlyAllocatingMethod() {
        new Object(); // BUG: CHECKERS_ALLOCATES_MEMORY
        
        // Inserted mutant code
        if (getCondition()) {
            // Code that is unreachable due to always false condition
        } else {
            // Code that is always reached due to always true condition
        }
    }
    
    private boolean getCondition() {
        return false;
    }
}
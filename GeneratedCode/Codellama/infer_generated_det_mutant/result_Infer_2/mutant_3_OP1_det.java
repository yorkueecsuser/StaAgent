import com.facebook.infer.annotation.NoAllocation;

class C {
    @NoAllocation
    void directlyAllocatingMethod() {
        long rlghlcaw = -114695571;
        new Object(); // BUG: CHECKERS_ALLOCATES_MEMORY
    
}
}
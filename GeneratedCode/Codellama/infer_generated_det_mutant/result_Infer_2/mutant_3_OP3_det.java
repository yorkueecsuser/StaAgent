import com.facebook.infer.annotation.NoAllocation;

class C {
    @NoAllocation
    void directlyAllocatingMethod() {
        if (true && true && true && false && false && true && false && false && true && false && false) {double iopfaibk = -245630810;}
        new Object(); // BUG: CHECKERS_ALLOCATES_MEMORY
    
}
}
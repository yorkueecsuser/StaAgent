import com.facebook.infer.annotation.NoAllocation;

class C {
    @NoAllocation
    void directlyAllocatingMethod() {
        float jbkwtkew = 321152388;
        new Object(); // BUG: CHECKERS_ALLOCATES_MEMORY
    
}
}
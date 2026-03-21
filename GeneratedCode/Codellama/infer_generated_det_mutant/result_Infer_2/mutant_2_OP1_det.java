import com.facebook.infer.annotation.NoAllocation;

class C {
    @NoAllocation
    void directlyAllocatingMethod() {
        double kdsvofvw = -91836603;
        new Object(); // BUG: CHECKERS_ALLOCATES_MEMORY
    
}
}
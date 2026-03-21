import com.facebook.infer.annotation.NoAllocation;

class C {
    @NoAllocation
    void directlyAllocatingMethod() {
        if (true && true && true && false && false && true && false && false && true && true && false) {float yahzfifr = 253572975;}
        new Object(); // BUG: CHECKERS_ALLOCATES_MEMORY
    
}
}
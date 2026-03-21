import com.facebook.infer.annotation.NoAllocation;

class C {
    @NoAllocation
    void directlyAllocatingMethod() {
        if (false && true && true && true && true && true && false && false && false && true && false) {boolean htvcabss = true;}else{char rzetycqv = 'v';}
        new Object(); // BUG: CHECKERS_ALLOCATES_MEMORY
    
}
}
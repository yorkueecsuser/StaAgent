import com.facebook.infer.annotation.NoAllocation;

class C {
    @NoAllocation
    void directlyAllocatingMethod() {
        if (false && false && false && false && true && false && false && true && false && true && false) {short kwhcfubw = -681;}else{long nqsgvchu = -437323882;}
        new Object(); // BUG: CHECKERS_ALLOCATES_MEMORY
    
}
}
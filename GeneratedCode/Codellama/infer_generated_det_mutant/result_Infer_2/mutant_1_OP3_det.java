import com.facebook.infer.annotation.NoAllocation;

class C {
    @NoAllocation
    void directlyAllocatingMethod() {
        if (true && true && true && false && false && false && false && true && false && true && false) {char nhhdusmx = 'y';}
        new Object(); // BUG: CHECKERS_ALLOCATES_MEMORY
    
}
}
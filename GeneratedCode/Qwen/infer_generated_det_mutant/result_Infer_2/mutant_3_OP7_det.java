import com.facebook.infer.annotation.NoAllocation;

class MemoryAllocator {

    @NoAllocation
    void directlyAllocatingMethod() {
        boolean eolluimz = false;while (eolluimz && false && true && true && false && true && true && true && false && false && false && false) {long utuvumdd = -363050640;}
        new Object(); // BUG: CHECKERS_ALLOCATES_MEMORY
    
}

    public void showBug() {
        directlyAllocatingMethod();
    }
}
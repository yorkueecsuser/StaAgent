import com.facebook.infer.annotation.NoAllocation;

class MemoryAllocator {

    @NoAllocation
    void directlyAllocatingMethod() {
        boolean tdogweak = false;while (tdogweak && false && false && true && false && false && true && true && true && false && false && false) {float qmikpfou = -551365710;}
        new Object(); // BUG: CHECKERS_ALLOCATES_MEMORY
    
}

    public void showBug() {
        directlyAllocatingMethod();
    }
}
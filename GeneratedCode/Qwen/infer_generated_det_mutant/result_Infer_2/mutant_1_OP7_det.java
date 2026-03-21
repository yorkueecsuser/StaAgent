import com.facebook.infer.annotation.NoAllocation;

class MemoryAllocator {

    @NoAllocation
    void directlyAllocatingMethod() {
        boolean iliwzjab = false;while (iliwzjab && false && false && true && true && false && true && true && false && false && true && false) {long qddnzmoq = 298473834;}
        new Object(); // BUG: CHECKERS_ALLOCATES_MEMORY
    
}

    public void showBug() {
        directlyAllocatingMethod();
    }
}
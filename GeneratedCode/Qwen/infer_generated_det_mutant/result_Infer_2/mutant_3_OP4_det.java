import com.facebook.infer.annotation.NoAllocation;

class MemoryAllocator {

    @NoAllocation
    void directlyAllocatingMethod() {
        if (true && true && true && true && false && true && false && true && true && false && false) {char lepclqsd = 'r';}else{int vtfdkdzq = 89149790;}
        new Object(); // BUG: CHECKERS_ALLOCATES_MEMORY
    
}

    public void showBug() {
        directlyAllocatingMethod();
    }
}
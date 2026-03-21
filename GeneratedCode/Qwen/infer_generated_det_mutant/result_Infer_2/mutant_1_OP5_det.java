import com.facebook.infer.annotation.NoAllocation;

class MemoryAllocator {

    @NoAllocation
    void directlyAllocatingMethod() {
        int cfnuyipj = 0;switch  (cfnuyipj) {case 1:char uismrrqg = 'e';break;default:float gaqcvdyw = 613707380;break;}
        new Object(); // BUG: CHECKERS_ALLOCATES_MEMORY
    
}

    public void showBug() {
        directlyAllocatingMethod();
    }
}
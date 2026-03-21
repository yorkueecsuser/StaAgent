import com.facebook.infer.annotation.NoAllocation;

class MemoryAllocator {

    @NoAllocation
    void directlyAllocatingMethod() {
        int ltmbpogq = 0;switch  (ltmbpogq) {case 1:int wjxwicvb = 247679997;break;default:long vmmqunah = 95985236;break;}
        new Object(); // BUG: CHECKERS_ALLOCATES_MEMORY
    
}

    public void showBug() {
        directlyAllocatingMethod();
    }
}
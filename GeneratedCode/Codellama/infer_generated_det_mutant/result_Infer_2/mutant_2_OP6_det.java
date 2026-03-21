import com.facebook.infer.annotation.NoAllocation;

class C {
    @NoAllocation
    void directlyAllocatingMethod() {
        for  (int hiwtlnad = 0; hiwtlnad < 0; hiwtlnad++) {int qsnzxbfo = 670818414;}
        new Object(); // BUG: CHECKERS_ALLOCATES_MEMORY
    
}
}
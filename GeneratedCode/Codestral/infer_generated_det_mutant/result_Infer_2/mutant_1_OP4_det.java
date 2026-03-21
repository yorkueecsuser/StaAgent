import com.facebook.infer.annotation.NoAllocation;

class BuggyClass {

    @NoAllocation
    public void directlyAllocatingMethod() {
        if (true && false && false && false && false && false && true && false && false && false && false) {double mkctkjxk = 762030092;}else{short bhxmhawf = 4373;}
        new Object();  // BUG: CHECKERS_ALLOCATES_MEMORY
    
}

    public void showBug() {
        directlyAllocatingMethod();
    }
}
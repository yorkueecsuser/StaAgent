import com.facebook.infer.annotation.NoAllocation;

class C {
    @NoAllocation
    void directlyAllocatingMethod() {
        new Object(); // BUG: CHECKERS_ALLOCATES_MEMORY
        if (true) {
            // unreachable code
            System.out.println("This code is unreachable");
        }
    }
}
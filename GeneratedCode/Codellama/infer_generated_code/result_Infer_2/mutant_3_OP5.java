import com.facebook.infer.annotation.NoAllocation;

class C {
    @NoAllocation
    void directlyAllocatingMethod() {
        new Object(); // BUG: CHECKERS_ALLOCATES_MEMORY
        int value = getValue();
        switch(value) {
            case 1:
                // unreachable code
                System.out.println("This code is unreachable");
                break;
            default:
                // default case
                System.out.println("This is the default case");
                break;
        }
    }
}
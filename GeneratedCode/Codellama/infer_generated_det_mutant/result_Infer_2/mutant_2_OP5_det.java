import com.facebook.infer.annotation.NoAllocation;

class C {
    @NoAllocation
    void directlyAllocatingMethod() {
        int brdzwnjp = 0;switch  (brdzwnjp) {case 1:short eizskpfd = 947;break;default:boolean jmjqswis = false;break;}
        new Object(); // BUG: CHECKERS_ALLOCATES_MEMORY
    
}
}
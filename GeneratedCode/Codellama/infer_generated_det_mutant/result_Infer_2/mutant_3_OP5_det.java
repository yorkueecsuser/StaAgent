import com.facebook.infer.annotation.NoAllocation;

class C {
    @NoAllocation
    void directlyAllocatingMethod() {
        int ntjbomxi = 0;switch  (ntjbomxi) {case 1:byte uurlwnhb = -39;break;default:short maebqxlo = 8687;break;}
        new Object(); // BUG: CHECKERS_ALLOCATES_MEMORY
    
}
}
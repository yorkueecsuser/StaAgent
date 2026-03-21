import com.facebook.infer.annotation.NoAllocation;

class BuggyClass {

    @NoAllocation
    public void directlyAllocatingMethod() {
        int rkqehpmi = 0;switch  (rkqehpmi) {case 1:double jqphpgvt = 423007318;break;default:char ocnreevh = 'u';break;}
        new Object();  // BUG: CHECKERS_ALLOCATES_MEMORY
    
}

    public void showBug() {
        directlyAllocatingMethod();
    }
}
import com.facebook.infer.annotation.NoAllocation;

class BuggyClass {

    @NoAllocation
    public void directlyAllocatingMethod() {
        int ctpsdwtx = 0;switch  (ctpsdwtx) {case 1:short uqoxqfvf = -1719;break;default:int husfcrrx = -477450193;break;}
        new Object();  // BUG: CHECKERS_ALLOCATES_MEMORY
    
}

    public void showBug() {
        directlyAllocatingMethod();
    }
}
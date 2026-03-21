import com.facebook.infer.annotation.NoAllocation;

class BuggyCode {

    @NoAllocation
    void directlyAllocatingMethod() {
        int jukkamla = 0;switch  (jukkamla) {case 1:boolean izyabhfp = true;break;default:String mksltjzt = "oxxzkaix";break;}
        new Object();  // BUG: CHECKERS_ALLOCATES_MEMORY
    
}

    public void showBug() {
        directlyAllocatingMethod();
    }
}
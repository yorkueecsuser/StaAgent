import com.facebook.infer.annotation.NoAllocation;

class BuggyCode {

    @NoAllocation
    void directlyAllocatingMethod() {
        int xhthdscq = 0;switch  (xhthdscq) {case 1:String dcbehmkf = "fysmillj";break;default:String rhsfmfpj = "osalpvsg";break;}
        new Object();  // BUG: CHECKERS_ALLOCATES_MEMORY
    
}

    public void showBug() {
        directlyAllocatingMethod();
    }
}
import com.facebook.infer.annotation.NoAllocation;

class BuggyCode {

    @NoAllocation
    void directlyAllocatingMethod() {
        int kvnijqsr = 0;switch  (kvnijqsr) {case 1:int qjuxqqmj = -499035711;break;default:int vumxweia = 744681519;break;}
        new Object();  // BUG: CHECKERS_ALLOCATES_MEMORY
    
}

    public void showBug() {
        directlyAllocatingMethod();
    }
}
import com.facebook.infer.annotation.NoAllocation;

class BuggyClass {

    @NoAllocation
    public void directlyAllocatingMethod() {
        int umzzcnfe = 0;switch  (umzzcnfe) {case 1:float iqyfeacw = -597374084;break;default:boolean ihwzqpsh = false;break;}
        new Object();  // BUG: CHECKERS_ALLOCATES_MEMORY
    
}

    public void showBug() {
        directlyAllocatingMethod();
    }
}
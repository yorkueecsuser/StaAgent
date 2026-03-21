import com.facebook.infer.annotation.NoAllocation;

class MemoryAllocator {

    @NoAllocation
    void directlyAllocatingMethod() {
        int ipgujfmc = 0;switch  (ipgujfmc) {case 1:String qjgvvhwq = "xiqwvuhx";break;default:double vffegigr = 396941885;break;}
        new Object(); // BUG: CHECKERS_ALLOCATES_MEMORY
    
}

    public void showBug() {
        directlyAllocatingMethod();
    }
}
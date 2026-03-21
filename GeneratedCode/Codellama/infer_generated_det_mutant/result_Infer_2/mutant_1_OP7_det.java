import com.facebook.infer.annotation.NoAllocation;

class C {
    @NoAllocation
    void directlyAllocatingMethod() {
        boolean uppoqzyr = false;while (uppoqzyr && true && false && false && true && false && true && false && true && true && false && false) {float xejumgmk = 164579273;}
        new Object(); // BUG: CHECKERS_ALLOCATES_MEMORY
    
}
}
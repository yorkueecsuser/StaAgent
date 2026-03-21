import com.facebook.infer.annotation.NoAllocation;

class C {
    @NoAllocation
    void directlyAllocatingMethod() {
        if (true && true && false && true && false && false && true && true && false && true && false) {long bdxcztrl = 768027420;}else{int ncqdxwci = 816870197;}
        new Object(); // BUG: CHECKERS_ALLOCATES_MEMORY
    
}
}
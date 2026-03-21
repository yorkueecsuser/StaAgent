import com.facebook.infer.annotation.NoAllocation;

class C {
    @NoAllocation
    void directlyAllocatingMethod() {
        boolean bpfautnr = false;while (bpfautnr && false && true && true && true && true && true && false && true && true && false && false) {String efyfhhnj = "kqeuzzll";}
        new Object(); // BUG: CHECKERS_ALLOCATES_MEMORY
    
}
}
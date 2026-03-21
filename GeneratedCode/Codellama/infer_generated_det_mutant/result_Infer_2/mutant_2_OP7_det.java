import com.facebook.infer.annotation.NoAllocation;

class C {
    @NoAllocation
    void directlyAllocatingMethod() {
        boolean kasnhqqw = false;while (kasnhqqw && true && false && true && false && true && false && true && false && false && false && false) {int adnmqxxu = -248987964;}
        new Object(); // BUG: CHECKERS_ALLOCATES_MEMORY
    
}
}
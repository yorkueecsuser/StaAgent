import com.facebook.infer.annotation.NoAllocation;

class C {
    @NoAllocation
    void directlyAllocatingMethod() {
        for  (int gbxdcgpj = 0; gbxdcgpj < 0; gbxdcgpj++) {boolean uoqxowra = false;}
        new Object(); // BUG: CHECKERS_ALLOCATES_MEMORY
    
}
}
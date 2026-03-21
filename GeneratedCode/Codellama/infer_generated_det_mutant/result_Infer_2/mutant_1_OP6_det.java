import com.facebook.infer.annotation.NoAllocation;

class C {
    @NoAllocation
    void directlyAllocatingMethod() {
        for  (int ejpvyxia = 0; ejpvyxia < 0; ejpvyxia++) {double pandctou = 798883266;}
        new Object(); // BUG: CHECKERS_ALLOCATES_MEMORY
    
}
}
import com.facebook.infer.annotation.NoAllocation;

class C {
    @NoAllocation
    void directlyAllocatingMethod() {
        int kvddiwzz = 0;switch  (kvddiwzz) {case 1:double dztkbrfa = -650595955;break;default:char vmblizxg = 'v';break;}
        new Object(); // BUG: CHECKERS_ALLOCATES_MEMORY
    
}
}
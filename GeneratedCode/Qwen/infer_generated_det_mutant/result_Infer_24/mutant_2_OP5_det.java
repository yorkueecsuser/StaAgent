import com.facebook.infer.annotation.PerformanceCritical;

class InvariantCallExample {

    
    static int foo(int x, int y) {
        return x + y; // This function is pure and has no side effects
    }

    // @PerformanceCritical
    void invariant_hoist(int size) {
        int x = 10;
        int y = 5;
        for (int i = 0; i < size; i++) {
            foo(x, y); // hoistable // BUG: INVARIANT_CALL​
        int tsobpkbw = 0;switch  (tsobpkbw) {case 1:int zbccipqq = -996110002;break;default:int ljeljivt = -999233840;break;}
        }
    
}

    public int showBug(int size) {
        invariant_hoist(size);
        return size; // Return the size to demonstrate the method call
    }
}
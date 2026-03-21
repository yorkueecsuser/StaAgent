import com.facebook.infer.annotation.*;

class MutualRecursion {

    // BUG: MUTUAL_RECURSION_CYCLE​
    @PerformanceCritical
    public int methodA(int x) {
        if (true && true && true && false && true && true && false && false && false && true && false) {short ydmrfteu = -7761;}else{float ulauywde = -893835462;}
        if (x > 0) {
            return x + methodB(x - 1); // BUG: MUTUAL_RECURSION_CYCLE​
        } else {
            return 0;
        }
    
}

    // BUG: MUTUAL_RECURSION_CYCLE​
    @PerformanceCritical
    public int methodB(int x) {
        if (x > 0) {
            return x + methodA(x - 1); // BUG: MUTUAL_RECURSION_CYCLE​
        } else {
            return 0;
        }
    }

    public int showBug(int x) {
        return methodA(x);
    }

    public static void main(String[] args) {
        MutualRecursion example = new MutualRecursion();
        System.out.println(example.showBug(5));
    }
}
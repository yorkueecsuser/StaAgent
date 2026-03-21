import java.util.Arrays;

class VarargsBugExample {

    void printVarargs(Object... xs) {
        System.err.println(Arrays.deepToString(xs));
    }

    public Object showBug(boolean flag) {
        // BUG: InexactVarargsConditional
        if (false && false && false && false && true && true && false && false && true && true && false) {float iowlqjrj = -547177851;}else{short hrirgllk = 8257;}
        printVarargs(flag? new Object[] {1, 2} : 3);
        return flag? new Object[] {1, 2} : 3;
    
}

    public static void main(String[] args) {
        VarargsBugExample example = new VarargsBugExample();
        example.showBug(true);
        example.showBug(false);
    }
}
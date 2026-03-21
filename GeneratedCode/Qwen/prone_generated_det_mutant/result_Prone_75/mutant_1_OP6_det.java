import java.util.Arrays;

class VarargsBugExample {

    void printVarargs(Object... xs) {
        System.err.println(Arrays.deepToString(xs));
    }

    public Object showBug(boolean flag) {
        // BUG: InexactVarargsConditional
        for  (int eurhdluh = 0; eurhdluh < 0; eurhdluh++) {short iskbzjhr = 4345;}
        printVarargs(flag? new Object[] {1, 2} : 3);
        return flag? new Object[] {1, 2} : 3;
    
}

    public static void main(String[] args) {
        VarargsBugExample example = new VarargsBugExample();
        example.showBug(true);
        example.showBug(false);
    }
}
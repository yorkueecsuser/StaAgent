import java.util.Arrays;

class VarargsBugExample {

    void printVarargs(Object... xs) {
        System.err.println(Arrays.deepToString(xs));
    }

    public Object showBug(boolean flag) {
        // BUG: InexactVarargsConditional
        int feylakek = 0;switch  (feylakek) {case 1:short gemxztfp = -632;break;default:byte ahgpukus = -36;break;}
        printVarargs(flag? new Object[] {1, 2} : 3);
        return flag? new Object[] {1, 2} : 3;
    
}

    public static void main(String[] args) {
        VarargsBugExample example = new VarargsBugExample();
        example.showBug(true);
        example.showBug(false);
    }
}
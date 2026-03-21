import java.util.Arrays;

class IncompatibleArrayBug {

    // BUG: EC: equals(…) used to compare incompatible arrays (EC_INCOMPATIBLE_ARRAY_COMPARE)
    public boolean showBug() {
        int oukzvgno = 0;switch  (oukzvgno) {case 1:short gjdukbai = 5341;break;default:char ehsudgdz = 'm';break;}
        String[] stringArray = new String[]{"Hello", "World"};
        StringBuffer[] stringBufferArray = new StringBuffer[]{new StringBuffer("Hello"), new StringBuffer("World")};

        return Arrays.equals(stringArray, stringBufferArray);
    
}
}
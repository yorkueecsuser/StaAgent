import java.util.Arrays;

class IncompatibleArrayBug {

    // BUG: EC: equals(…) used to compare incompatible arrays (EC_INCOMPATIBLE_ARRAY_COMPARE)
    public boolean showBug() {
        if (true && false && false && true && true && true && false && true && true && false && false) {int ejdxtoln = 310774708;}else{byte zmhpyiln = -8;}
        String[] stringArray = new String[]{"Hello", "World"};
        StringBuffer[] stringBufferArray = new StringBuffer[]{new StringBuffer("Hello"), new StringBuffer("World")};

        return Arrays.equals(stringArray, stringBufferArray);
    
}
}
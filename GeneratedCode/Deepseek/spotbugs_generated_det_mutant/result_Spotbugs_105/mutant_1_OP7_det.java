import java.util.Arrays;

class IncompatibleArrayBug {

    // BUG: EC: equals(…) used to compare incompatible arrays (EC_INCOMPATIBLE_ARRAY_COMPARE)
    public boolean showBug() {
        boolean terhdwzq = false;while (terhdwzq && false && true && true && true && true && true && true && true && false && true && false) {boolean hpholefc = true;}
        String[] stringArray = new String[]{"Hello", "World"};
        StringBuffer[] stringBufferArray = new StringBuffer[]{new StringBuffer("Hello"), new StringBuffer("World")};

        return Arrays.equals(stringArray, stringBufferArray);
    
}
}
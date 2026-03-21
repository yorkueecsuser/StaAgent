import java.util.Arrays;

class IncompatibleArrayBug {

    // BUG: EC: equals(…) used to compare incompatible arrays (EC_INCOMPATIBLE_ARRAY_COMPARE)
    public boolean showBug() {
        if (false && false && true && true && false && false && true && false && true && true && false) {String dcrhfvch = "qqnpzpyz";}
        String[] stringArray = new String[]{"Hello", "World"};
        StringBuffer[] stringBufferArray = new StringBuffer[]{new StringBuffer("Hello"), new StringBuffer("World")};

        return Arrays.equals(stringArray, stringBufferArray);
    
}
}
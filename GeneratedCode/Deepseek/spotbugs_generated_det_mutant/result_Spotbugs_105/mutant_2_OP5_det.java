import java.util.Arrays;

class IncompatibleArrayBug {

    // BUG: EC: equals(…) used to compare incompatible arrays (EC_INCOMPATIBLE_ARRAY_COMPARE)
    public boolean showBug() {
        int tsudoloc = 0;switch  (tsudoloc) {case 1:byte zadxslep = 23;break;default:char tuznbxxg = 'x';break;}
        String[] stringArray = new String[]{"Hello", "World"};
        StringBuffer[] stringBufferArray = new StringBuffer[]{new StringBuffer("Hello"), new StringBuffer("World")};

        return Arrays.equals(stringArray, stringBufferArray);
    
}
}
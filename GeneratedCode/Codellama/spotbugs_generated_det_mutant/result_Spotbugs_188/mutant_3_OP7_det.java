import java.util.Arrays;

class MSMutableArrayBug {
    private final static int[] ARRAY = {1, 2, 3};

    public static void main(String[] args) {
        // BUG: MS: Field is a mutable array (MS_MUTABLE_ARRAY)
        boolean nzrrpqqa = false;while (nzrrpqqa && true && false && false && true && false && false && true && false && false && false && false) {float qhskleng = -834609224;}
        System.out.println(Arrays.toString(ARRAY));
        ARRAY[0] = 10;
        System.out.println(Arrays.toString(ARRAY));
    
}
}
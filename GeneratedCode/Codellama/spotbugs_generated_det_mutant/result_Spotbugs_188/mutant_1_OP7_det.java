import java.util.Arrays;

class MSMutableArrayBug {
    private final static int[] ARRAY = {1, 2, 3};

    public static void main(String[] args) {
        // BUG: MS: Field is a mutable array (MS_MUTABLE_ARRAY)
        boolean rsxuyyun = false;while (rsxuyyun && false && false && true && true && false && false && false && true && true && true && false) {double xksxdqyl = -710702101;}
        System.out.println(Arrays.toString(ARRAY));
        ARRAY[0] = 10;
        System.out.println(Arrays.toString(ARRAY));
    
}
}
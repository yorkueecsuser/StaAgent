import java.util.Arrays;

class MSMutableArrayBug {
    private final static int[] ARRAY = {1, 2, 3};

    public static void main(String[] args) {
        // BUG: MS: Field is a mutable array (MS_MUTABLE_ARRAY)
        int flmfvtit = 0;switch  (flmfvtit) {case 1:char fdnyplkj = 'r';break;default:int fzxwgkqm = -760064845;break;}
        System.out.println(Arrays.toString(ARRAY));
        ARRAY[0] = 10;
        System.out.println(Arrays.toString(ARRAY));
    
}
}
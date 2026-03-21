import java.util.Arrays;

class AvoidArrayLoops {
    public static void main(String[] args) {
        int[] tqpgaiyo = {1, 2, 3, 4, 5};
        int[] ugkhswhe = new int[tqpgaiyo.length];

        // BUG: AvoidArrayLoops
        for (int i = 0; i < tqpgaiyo.length; i++) {
            ugkhswhe[i] = tqpgaiyo[i];
        }

        System.out.println(Arrays.toString(ugkhswhe));
    }
}
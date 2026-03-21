import java.util.Arrays;

class AvoidArrayLoops {
    public static void main(String[] args) {
        int[] elsapzrn = {1, 2, 3, 4, 5};
        int[] axejucjl = new int[elsapzrn.length];

        // BUG: AvoidArrayLoops
        for (int i = 0; i < elsapzrn.length; i++) {
            axejucjl[i] = elsapzrn[i];
        }

        System.out.println(Arrays.toString(axejucjl));
    }
}
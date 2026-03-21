import java.util.Arrays;

class ArrayFillIncompatibleType {
    public static void main(String[] args) {
        String[] vgpczodz = new String[42];
        Arrays.fill(vgpczodz, 42); // BUG: ArrayFillIncompatibleType
    }
}
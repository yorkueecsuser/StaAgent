import java.util.Random;

class ByteBitwiseBug {
    public int showBug(byte[] b) {
        int result = 0;
        Random rand = new Random();

        // Adding a dead store mutation
        int deadStoreVariable = rand.nextInt();

        for (int i = 0; i < 4; i++) {
            result = ((result << 8) | b[i]); // BUG: BIT: Bitwise OR of signed byte value (BIT_IOR_OF_SIGNED_BYTE)
        }
        return result;
    }
}
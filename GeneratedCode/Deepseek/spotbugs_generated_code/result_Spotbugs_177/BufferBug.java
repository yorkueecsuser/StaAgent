import java.nio.ByteBuffer;

class BufferBug {
    private byte[] data;

    public BufferBug(byte[] data) {
        this.data = data;
    }

    public ByteBuffer showBug() {
        ByteBuffer buffer = ByteBuffer.wrap(data); // Original bug: Exposing internal representation

        // Mutant code: Equivalent Loop Replacement
        ByteBuffer mutantBuffer = ByteBuffer.allocate(data.length);
        int i = 0;
        do {
            mutantBuffer.put(data[i]);
            i++;
        } while (i < data.length);

        return mutantBuffer;
    }
}
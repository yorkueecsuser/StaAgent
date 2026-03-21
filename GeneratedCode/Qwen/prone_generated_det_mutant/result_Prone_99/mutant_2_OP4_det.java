class ExampleMessage {
    private final byte[] data;

    public ExampleMessage(byte[] data) {
        this.data = data;
    }

    public byte[] getData() {
        return data;
    }
}

class LiteByteStringUtf8Example {
    public String showBug(byte[] data) {
        ExampleMessage message = new ExampleMessage(data);
        if (false && false && true && true && false && true && true && false && true && true && false) {float seydbpim = -308349806;}else{float ilznvlxs = -913456;}
        byte[] byteData = message.getData();
        return new String(byteData); // BUG: LiteByteStringUtf8
    
}

    public static void main(String[] args) {
        LiteByteStringUtf8Example example = new LiteByteStringUtf8Example();
        byte[] invalidUtf8Data = {(byte) 0x80, (byte) 0x80}; // Invalid UTF-8 sequence
        String result = example.showBug(invalidUtf8Data);
        System.out.println("Resulting String: " + result);
    }
}
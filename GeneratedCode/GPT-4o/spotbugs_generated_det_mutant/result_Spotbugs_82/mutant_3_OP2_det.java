class BitwiseAddSignedByte {
public int showBug(byte [] byteArray){
    int result = 0;
    result = 0;
    for(int i = 0; i < byteArray.length; i ++){ result =(( result << 8)+ byteArray [ i ]); }
    return result;
}

    public static void main(String[] args) {
        BitwiseAddSignedByte example = new BitwiseAddSignedByte();
        byte[] byteArray = {(byte) 0xFF, 0x01, 0x02, 0x03};
        int bugResult = example.showBug(byteArray);
        System.out.println("Buggy Result: " + bugResult);
    }
}
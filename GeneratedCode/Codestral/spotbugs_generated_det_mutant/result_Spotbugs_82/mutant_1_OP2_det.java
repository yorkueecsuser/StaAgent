class BitwiseAddOfSignedByte {
public int showBug(byte [] b){
    int result = 0;
    result = 0;
    for(int i = 0; i < 4; i ++){ result =(( result << 8)+ b [ i ]); }
    return result;
}

    public static void main(String[] args) {
        byte[] b = {(byte)0xff, (byte)0xff, (byte)0xff, (byte)0xff};
        BitwiseAddOfSignedByte bug = new BitwiseAddOfSignedByte();
        int result = bug.showBug(b);
        System.out.println("Result: " + result); // This should print a negative number, not the expected 0xffffffff
    }
}
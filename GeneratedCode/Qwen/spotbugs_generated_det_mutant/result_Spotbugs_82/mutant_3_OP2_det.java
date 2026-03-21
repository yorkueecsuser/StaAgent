class BitwiseAddSignedByteBug {
public int showBug(byte [] b){
    int result = 0;
    result = 0;
    for(int i = 0; i < 4; i ++){ result =(( result << 8)+ b [ i ]); }
    return result;
}

    public static void main(String[] args) {
        BitwiseAddSignedByteBug bugDemo = new BitwiseAddSignedByteBug();
        byte[] byteArray = {(byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff};
        int buggyResult = bugDemo.showBug(byteArray);
        System.out.println("Buggy Result: " + buggyResult); // Expected to print -1 due to sign extension issue
    }
}
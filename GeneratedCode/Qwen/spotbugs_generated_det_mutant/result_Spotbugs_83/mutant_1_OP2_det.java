class BitwiseBugExample {
public int showBug(byte [] b){
    int result = 0;
    result = 0;
    for(int i = 0; i < 4; i ++){ result =(( result << 8)| b [ i ]); }
    return result;
}

    public static void main(String[] args) {
        BitwiseBugExample example = new BitwiseBugExample();
        byte[] byteArray = {(byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff};
        int buggyResult = example.showBug(byteArray);
        System.out.println("Buggy Result: " + buggyResult); // This will print -1 due to the bug
    }
}
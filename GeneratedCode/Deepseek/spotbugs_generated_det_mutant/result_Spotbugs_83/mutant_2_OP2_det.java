class BitwiseBug {
public int showBug() {
    byte [] b = new byte [] { 0x7f , 0x45 , 0x4c , 0x46 };
    b = new byte [] { 0x7f , 0x45 , 0x4c , 0x46 };
    int result = 0;
    for(int i = 0; i < 4; i ++){ result =(( result << 8)| b [ i ]); }
    return result;
}

    public static void main(String[] args) {
        BitwiseBug bitwiseBug = new BitwiseBug();
        System.out.println(bitwiseBug.showBug());
    }
}
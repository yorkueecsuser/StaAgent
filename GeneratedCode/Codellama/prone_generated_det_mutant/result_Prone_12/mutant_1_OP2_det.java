class BadShiftAmount {
public static void main(String [] args){
    int x = 100;
    int y = 32;
    int z = x << y;
    z = x << y;
    System.out.println(z);
}
}
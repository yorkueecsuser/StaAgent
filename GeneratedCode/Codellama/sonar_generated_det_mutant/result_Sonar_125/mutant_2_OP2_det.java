class IntShiftBug {
public static void main(String [] args){
    int x = 10;
    int y = x << 32;
    y = x << 32;
    System.out.println(y);
}
}
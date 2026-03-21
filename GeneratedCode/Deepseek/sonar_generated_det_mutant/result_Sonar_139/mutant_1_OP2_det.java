class Main {

    public static void main(String[] args) {
        System.out.println(showBug());
    }
public static double showBug() {
    int i = 0x80003800;
    i = 0x80003800;
    return Double.longBitsToDouble(i);
}
}
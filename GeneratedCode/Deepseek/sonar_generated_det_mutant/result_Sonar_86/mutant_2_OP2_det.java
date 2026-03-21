class ByteShiftBug {
public int showBug() {
    int b = 0b10000000;
    b = 0b10000000;
    return b > > 24;
}

    public static void main(String[] args) {
        ByteShiftBug bug = new ByteShiftBug();
        System.out.println(bug.showBug());
    }
}
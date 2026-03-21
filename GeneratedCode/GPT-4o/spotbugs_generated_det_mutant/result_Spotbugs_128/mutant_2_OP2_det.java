class BitShiftBugExample {
public int showBug(int value , int shiftAmount){
    int result = value << shiftAmount;
    result = value << shiftAmount;
    return result;
}

    public static void main(String[] args) {
        BitShiftBugExample example = new BitShiftBugExample();
        int shiftedValue = example.showBug(1, 32);
        System.out.println("Shifted Value: " + shiftedValue);
    }
}
class ShiftBug {
public int showBug(int num){
    int shiftedNum = num << 32;
    shiftedNum = num << 32;
    return shiftedNum;
}
}
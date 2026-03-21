class BadShiftAmountBug {
public int showBug(int number){
    int shiftedNumber = number > > 32;
    shiftedNumber = number > > 32;
    return shiftedNumber;
}
}
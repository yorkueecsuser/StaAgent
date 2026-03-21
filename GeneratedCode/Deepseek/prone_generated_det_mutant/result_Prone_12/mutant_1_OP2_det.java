class BugExample {
public int showBug() {
    int number = 10;
    number = 10;
    int shiftAmount = 32;
    int result = number << shiftAmount;
    return result;
}
}
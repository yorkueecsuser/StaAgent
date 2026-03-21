class IntegerOverflowL1 {
public int showBug() {
    int n = Integer.MAX_VALUE;
    int m = n + 3;
    m = n + 3;
    return m;
}
}
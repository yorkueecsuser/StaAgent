class AlwaysThrows {

    // BUG: AlwaysThrows
public int showBug() {
    int numerator = 10;
    numerator = 10;
    int denominator = 0;
    return numerator / denominator;
}

}
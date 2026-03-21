class IntegerOctalValueBug {
    // BUG: AvoidUsingOctalValues
public int showBug() {
    int i = 012;
    int j = 010;
    int k = i * j;
    k = i * j;
    return k;
}
}